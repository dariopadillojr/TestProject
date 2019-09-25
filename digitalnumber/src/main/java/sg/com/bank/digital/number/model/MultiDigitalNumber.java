package sg.com.bank.digital.number.model;

import java.util.ArrayList;
import java.util.HashMap;

import sg.com.bank.digital.number.constants.Digit;
import sg.com.bank.digital.number.constants.Side;
import sg.com.bank.digital.util.Util;

/**
 * Multi-digital number program
 * @author dariopadillojr
 *
 */
public class MultiDigitalNumber extends DigitalNumber {

	private static final String SEPARATOR="";
	private ArrayList<HashMap<Side, String>> multiDigit = new ArrayList<HashMap<Side, String>>();
	private int number;
	
	
	public MultiDigitalNumber() {}

	public MultiDigitalNumber(int number) {
		setNumber(number);
		initialize();
	}
	
	private void initialize() {
		if (getNumber() < 0) {
			Util.print("Invalid number");
			return;
		}
		
		String sNumber = String.valueOf(getNumber());
		
		for( int i=0; i < sNumber.length(); i++ ){
			DigitalNumber digit = new DigitalNumber(getDigit(Integer.parseInt(String.valueOf(getNumber()).charAt(i) + "")));
			getMultiDigit().add(digit.getDigitalNumberMap());
		}
	}
	
	private Digit getDigit(int i) {
		Digit found = Digit.ZERO;
		for (Digit digit : Digit.values()) {
			if(digit.digit==i) {
				found=digit;
			}
		}
		
		return found;
	}

	/**
	 * Draws the digital number
	 */
	public void draw() {
		printDigitalNumberString();
	}
	
	private String printTopBtmMiddle(Side s) {
		StringBuffer sb = new StringBuffer();
		
		if (Side.TOP == s || Side.BOTTOM == s || Side.MIDDLE == s) {
			for (HashMap<Side, String> output : getMultiDigit()) {
				sb.append(output.get(s) + SEPARATOR );
			}
		} 
		
		return sb.toString();
		
	}
	
	private String printLeftRight(Side s1, Side s2) {
		StringBuffer sb = new StringBuffer();
		
		for (HashMap<Side, String> output : getMultiDigit()) {
			sb.append(output.get(s1) +  output.get(s2) + SEPARATOR );
		}
	
		return sb.toString();
	}
	
	private void printDigitalNumberString() {
		Util.print(printTopBtmMiddle(Side.TOP));
		Util.print(printLeftRight(Side.TOPLEFT, Side.TOPRIGHT));
		Util.print(printTopBtmMiddle(Side.MIDDLE));
		Util.print(printLeftRight(Side.BOTTOMLEFT, Side.BOTTOMRIGHT));
		Util.print(printTopBtmMiddle(Side.BOTTOM));
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<HashMap<Side, String>> getMultiDigit() {
		return multiDigit;
	}

}
