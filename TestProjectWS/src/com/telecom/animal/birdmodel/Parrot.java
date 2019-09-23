package com.telecom.animal.birdmodel;

import com.telecom.animal.trait.ParrotSound;
import com.telecom.constant.WingType;

public class Parrot extends Bird {
	private static final String NAME="Parrot";
	
	public Parrot() {
		setName(NAME);
		super.setBirdWings(WingType.NOT_CLIPPED);
	}
	
	public Parrot(ParrotSound parrotSound) {
		setName(NAME);
		super.setSound(parrotSound);
		super.setBirdWings(WingType.NOT_CLIPPED);
	}
}
