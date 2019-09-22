package com.telecom.animal.model;

import com.telecom.animal.trait.Sound;

public abstract class Animal {
	private String name="";
	private Sound sound;
	
	abstract public void move();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Sound getSound() {
		return sound;
	}
	public void setSound(Sound sound) {
		this.sound = sound;
	}
	
	
}
