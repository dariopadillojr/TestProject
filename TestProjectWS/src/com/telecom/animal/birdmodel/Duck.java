package com.telecom.animal.birdmodel;

import com.telecom.animal.trait.Sound;
import com.telecom.constant.WingType;
import com.telecom.util.Util;

public class Duck extends Bird {
	private static final String NAME="Duck";
	
	public Duck() {
		setName(NAME);
		super.setSound(new Sound("Quack, quack"));
		super.setBirdWings(WingType.CLIPPED);
	}
	
	public void move() {
		swim();
	}
		
	private void swim() {
		Util.print(getName() + " can swim");
	}
}
