package com.telecom.animal.birdmodel;

import com.telecom.animal.trait.Sound;
import com.telecom.constant.Gender;
import com.telecom.constant.WingType;

public class Chicken extends Bird {
	private static final String NAME="Chicken";
	private Gender gender;
	
	public Chicken() {
		setName(NAME);
		super.setSound(new Sound("Cluck, cluck"));
		super.setBirdWings(WingType.CLIPPED);
	}
	
	public Chicken(Gender gender) {
		this.gender=gender;
				
		super.setSound(new Sound("Cluck, cluck"));
		super.setBirdWings(WingType.CLIPPED);
	}
	
	public boolean isRooster() {
		return (null != getGender() && Gender.MALE == gender);
	}
	
	public boolean isHen() {
		return (null != getGender() && Gender.FEMALE == gender);
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
