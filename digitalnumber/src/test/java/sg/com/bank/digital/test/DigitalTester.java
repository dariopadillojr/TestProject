package sg.com.bank.digital.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sg.com.bank.digital.number.constants.Digit;
import sg.com.bank.digital.number.model.DigitalNumber;
import sg.com.bank.digital.number.model.MultiDigitalNumber;

public class DigitalTester {

	@Test
	public void testDigitalNumDraw() {
		// test each digit can be rendered properly
		for (Digit digit : Digit.values()) {
			DigitalNumber digitNumber = new DigitalNumber(digit);
			digitNumber.draw();
		}
	}
	
	@Test
	public void testNegativeNumberCheck() {
		// test each digit can be rendered properly
		int negativeNumber=0;
		MultiDigitalNumber digitNumber = new MultiDigitalNumber(negativeNumber);
		assertTrue("Invalid Number", digitNumber.getNumber() >= Digit.ZERO.digit);
	}
	
	@Test(timeout = 1000)
	public void testDigitalNumPerformance() {
		// converts  1000, 10-digit digital numbers in 1 second
		int number=1234567890;
		for (int i=0 ; i <=1000;i++) {
			MultiDigitalNumber digitNumber = new MultiDigitalNumber(number);
			digitNumber.draw();
		}
	
	}

}
