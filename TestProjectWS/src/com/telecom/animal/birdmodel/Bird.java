package com.telecom.animal.birdmodel;

import com.telecom.animal.interfaces.BirdInterface;
import com.telecom.animal.model.Animal;
import com.telecom.animal.trait.Sound;
import com.telecom.constant.WingType;
import com.telecom.util.Util;

public class Bird extends Animal implements BirdInterface {
	
	private static final String NAME="Bird";
	private WingType birdWings;
	
	public Bird() {
		setName(NAME);
		super.setSound(new Sound("Tweet, tweet"));
		
		// default bird wing type
		setBirdWings(WingType.NOT_CLIPPED);
	}
	
	@Override
	public void move() {
		fly();
		
	}
	
	public void fly() {
		if(null != getBirdWings() 
				&& WingType.NOT_CLIPPED == getBirdWings()) {
			Util.print(getName() + " can fly");
		} else {
			Util.print(getName() + " cannot fly");
		}
	}
	
	public void sing() {
		Util.print(getName() + " sings " + getSound().toString());
	}
	
	public WingType getBirdWings() {
		return birdWings;
	}

	public void setBirdWings(WingType birdWings) {
		this.birdWings = birdWings;
	}

	
	
}
