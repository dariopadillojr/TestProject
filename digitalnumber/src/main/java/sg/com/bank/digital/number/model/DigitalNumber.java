package sg.com.bank.digital.number.model;

import java.util.HashMap;

import sg.com.bank.digital.number.constants.Digit;
import sg.com.bank.digital.number.constants.Side;
import sg.com.bank.digital.number.constants.State;

/**
 * Single digital number program
 * @author dariopadillojr
 *
 */
public class DigitalNumber {
	private Digit digit;
	private DigitModel digitModel;
	
	public DigitalNumber() {
		setDigit(Digit.ZERO);
		initialize(getDigit());
	}
	
	public DigitalNumber(Digit digit) {
		setDigit(digit);
		initialize(getDigit());
	}
	
	/**
	 * Initialize the digital map
	 * @param digit
	 */
	private void initialize(Digit digit) {
		switch(digit) {
			case ZERO  : initDigital0(); break;
			case ONE   : initDigital1(); break;	
			case TWO   : initDigital2(); break;	
			case THREE : initDigital3(); break;	
			case FOUR  : initDigital4(); break;	
			case FIVE  : initDigital5(); break;
			case SIX   : initDigital6(); break;	
			case SEVEN : initDigital7(); break;	
			case EIGHT : initDigital8(); break;
			case NINE  : initDigital9(); break;	
		}
	}

	public void draw() {
		String digitalNumber = getDigit(getDigitalNumberMap());
		System.out.println(digitalNumber);
	}
	
	public HashMap<Side, String> getDigitalNumberMap() {
		HashMap<Side, String> output = new HashMap<Side, String>();
		
		for(Side s : Side.values()) {
			StringBuffer sbSide = new StringBuffer();
			
			if(getDigitModel().getStateMap().containsKey(s)
				&& getDigitModel().getStateMap().get(s) == State.ON) {
				sbSide = printSideOn(sbSide, s);
			} else {
				sbSide = printSideOff(sbSide, s);
			}
			
			output.put(s, sbSide.toString());
		}
		
		return output;
	}
	
	/**
	 * Gets the digit string
	 * @param output
	 * @return
	 */
	private String getDigit(HashMap<Side, String> output) {
		StringBuffer sb = new StringBuffer();
		sb.append(output.get(Side.TOP) );
		sb.append("\n" + output.get(Side.TOPLEFT) + output.get(Side.TOPRIGHT));
		sb.append("\n" + output.get(Side.MIDDLE));
		sb.append("\n" + output.get(Side.BOTTOMLEFT) +  output.get(Side.BOTTOMRIGHT));
		sb.append("\n" + output.get(Side.BOTTOM));
		
		return sb.toString();
	}
	
	private StringBuffer printSideOff(StringBuffer sb , Side s) {
		if (Side.TOP == s || Side.BOTTOM == s || Side.MIDDLE == s) {
			sb.append("    ");
		} else if (Side.TOPLEFT == s || Side.TOPRIGHT == s || Side.BOTTOMLEFT == s || Side.BOTTOMRIGHT == s) {
			sb.append("  ");
		}
		else {
			sb.append(" ");
		}
		
		return sb;
	}
	
	private StringBuffer printSideOn(StringBuffer sb , Side s) {
		if (Side.TOP == s|| Side.BOTTOM == s || Side.MIDDLE == s) {
			sb.append(" ");
			sb.append(this.digitModel.getLineMap().get(s).line);
			sb.append(this.digitModel.getLineMap().get(s).line);
			sb.append(" ");
		} else if (Side.TOPLEFT == s || Side.BOTTOMLEFT == s) {
			sb.append(this.digitModel.getLineMap().get(s).line);
			sb.append(" ");
		} else if (Side.TOPRIGHT == s || Side.BOTTOMRIGHT == s) {
			sb.append(" ");
			sb.append(this.digitModel.getLineMap().get(s).line);
		}
		
		return sb;
		
	}
	
	private void initDigital0() {
		setDigit(Digit.ZERO);
		setDigitModel(new DigitModel(State.ON));
		getDigitModel().getStateMap().replace(Side.MIDDLE, State.OFF);
	}
	
	private void initDigital1() {
		setDigit(Digit.ONE);
		setDigitModel(new DigitModel(State.OFF));
		getDigitModel().getStateMap().replace(Side.TOPRIGHT, State.ON);
		getDigitModel().getStateMap().replace(Side.BOTTOMRIGHT, State.ON);
	}
	
	private void initDigital2() {
		setDigit(Digit.TWO);
		setDigitModel(new DigitModel(State.ON));
		getDigitModel().getStateMap().replace(Side.TOPLEFT, State.OFF);
		getDigitModel().getStateMap().replace(Side.BOTTOMRIGHT, State.OFF);
	}
	
	private void initDigital3() {
		setDigit(Digit.THREE);
		setDigitModel(new DigitModel(State.ON));
		getDigitModel().getStateMap().replace(Side.TOPLEFT, State.OFF);
		getDigitModel().getStateMap().replace(Side.BOTTOMLEFT, State.OFF);
	}
	
	private void initDigital4() {
		setDigit(Digit.FOUR);
		setDigitModel(new DigitModel(State.ON));
		getDigitModel().getStateMap().replace(Side.TOP, State.OFF);
		getDigitModel().getStateMap().replace(Side.BOTTOMLEFT, State.OFF);
		getDigitModel().getStateMap().replace(Side.BOTTOM, State.OFF);
	}
	
	private void initDigital5() {
		setDigit(Digit.FIVE);
		setDigitModel(new DigitModel(State.ON));
		getDigitModel().getStateMap().replace(Side.TOPRIGHT, State.OFF);
		getDigitModel().getStateMap().replace(Side.BOTTOMLEFT, State.OFF);
	}
	
	private void initDigital6() {
		setDigit(Digit.SIX);
		setDigitModel(new DigitModel(State.ON));
		getDigitModel().getStateMap().replace(Side.TOPRIGHT, State.OFF);
	}
	
	private void initDigital7() {
		setDigit(Digit.SEVEN);
		setDigitModel(new DigitModel(State.OFF));
		getDigitModel().getStateMap().replace(Side.TOP, State.ON);
		getDigitModel().getStateMap().replace(Side.TOPRIGHT, State.ON);
		getDigitModel().getStateMap().replace(Side.BOTTOMRIGHT, State.ON);
	}
	
	private void initDigital8() {
		setDigit(Digit.EIGHT);
		setDigitModel(new DigitModel(State.ON));
	}
	
	private void initDigital9() {
		setDigit(Digit.NINE);
		setDigitModel(new DigitModel(State.ON));
		getDigitModel().getStateMap().replace(Side.BOTTOMLEFT, State.OFF);
	}
	
	
	public Digit getDigit() {
		return digit;
	}

	public void setDigit(Digit digit) {
		this.digit = digit;
	}
	
	public DigitModel getDigitModel() {
		return digitModel;
	}

	public void setDigitModel(DigitModel digitModel) {
		this.digitModel = digitModel;
	}

}
