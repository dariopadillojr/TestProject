package com.telecom.animal.metamorphicmodel;

import com.telecom.constant.State;
import com.telecom.util.Util;

public class Butterfly extends MetamorphicAnimal {
	private static final String NAME_EGG_STAGE="Egg";
	private static final String NAME_CHILD_STAGE="Caterpillar";
	private static final String NAME_ADULT_STAGE="Butterfly";
	
	public Butterfly() {
		setState(State.STAGE_ADULT);
		setName(getName());
	}
	
	public Butterfly(State state) {
		setState(state);
		setName(getName());
	}

	public String getName() {
		if(null != getState() && State.STAGE_EGG==getState()) {
			return NAME_EGG_STAGE;
		 } else if(null != getState() && State.STAGE_CHILD==getState()) {
			 return NAME_CHILD_STAGE;
		 } else if(null != getState() && State.STAGE_ADULT==getState()) {
			 return NAME_ADULT_STAGE;
		 }
		
		return "";
	}
	
	public void metamorphic() {
		String name= getName();
		
		 if(null != getState() && State.STAGE_EGG==getState()) {
			 Util.print(name + " is " + State.STAGE_EGG);
			 egg();
		 } else if(null != getState() && State.STAGE_CHILD==getState()) {
			 Util.print(name + " is " +  State.STAGE_CHILD);
			 crawl();
		 } else if(null != getState() && State.STAGE_ADULT==getState()) {
			 Util.print(name + " is " + State.STAGE_ADULT);
			 fly();
		 }
	}
	
	public void fly() {
		if(null != getState() && State.STAGE_ADULT==getState()) {
			Util.print(getName() + " can fly");
		} else {
			Util.print(getName() + " cannot fly");
		}
		
	}
	
	public void crawl() {
		if(null != getState() && State.STAGE_CHILD==getState()) {
			Util.print(getName() + " can crawl");
		} else {
			Util.print(getName() + " cannot crawl");
		}
	}
	
	private void egg() {
		Util.print("Im an " + getName());
	}
	
}
