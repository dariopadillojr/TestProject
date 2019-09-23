package com.telecom.animal.metamorphicmodel;

import com.telecom.animal.model.Animal;
import com.telecom.constant.State;

public abstract class MetamorphicAnimal extends Animal {
	private String name="";
	private State state;

	abstract void metamorphic();
	
	public void move() {
		metamorphic();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
