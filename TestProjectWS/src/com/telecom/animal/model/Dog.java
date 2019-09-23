package com.telecom.animal.model;

import com.telecom.animal.interfaces.AnimalInterface;
import com.telecom.animal.trait.Sound;
import com.telecom.util.Util;

public class Dog extends Animal implements AnimalInterface {
	private static final String NAME="Dog";
	
	public Dog() {
		setName(NAME);
		super.setSound(new Sound("Woof, woof"));
	}
	
	public void move() {
		walk();
	}
	
	public void walk() {
		Util.print(getName() + " can walk");
	}
}
