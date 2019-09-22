package com.telecom.animal.birdmodel;

import com.telecom.animal.trait.Sound;
import com.telecom.constant.Gender;
import com.telecom.constant.WingType;

public class Rooster {
	private static final String NAME="Rooster";
	
	private Chicken chicken;
	
	public Rooster() {
		chicken = new Chicken(Gender.MALE);
		chicken.setName(NAME);
		chicken.setSound(new Sound("Cock-a-doodle-doo"));
		chicken.setBirdWings(WingType.CLIPPED);
	}
	
	public void move() {
		chicken.move();
	}
	
	public void sing() {
		chicken.sing();
	}
	
}
