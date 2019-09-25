package sg.com.bank.digital.exec;

import sg.com.bank.digital.number.model.MultiDigitalNumber;
import sg.com.bank.digital.util.Util;

public class DigitalMain {
	public static final int DEFAULT_VALUE=1234567890;
	
	public static void main(String[] args) {
		int number = DEFAULT_VALUE;
		
		if(null != args && args.length == 1) {
			try {
				number = Integer.parseInt(args[0]);
				if(number >= 0) {
					MultiDigitalNumber digitNumber = new MultiDigitalNumber(number);
					digitNumber.draw();
				} else {
					Util.print("Please specify a positive number.");
				}
			} catch (NumberFormatException nfe) {
				Util.print("Argument is not a number.");
			}
			
		} else {
			Util.print("Invalid argument.");
		}
		
		
		
	}
}
