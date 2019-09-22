package com.telecom.animal.fishmodel;

import com.telecom.animal.interfaces.FishInterface;
import com.telecom.util.Util;

public class Dolphin implements FishInterface {
	private static final String NAME="Dolphin";
	
	private String name;
	

	public Dolphin() {
		this.name=NAME;
	}
	
	public void swim() {
		Util.print(getName() + " can swim");
	}
	
	public String getName() {
		return name;
	}
	
}
