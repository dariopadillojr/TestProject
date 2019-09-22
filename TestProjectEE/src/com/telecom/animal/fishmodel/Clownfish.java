package com.telecom.animal.fishmodel;

import com.telecom.constant.Color;
import com.telecom.constant.Size;
import com.telecom.util.Util;

public class Clownfish extends Fish {
	private static final String NAME="Clownfish";
	
	public Clownfish() {
		setName(NAME);
		setSize(Size.SMALL);
		
		//colors
		getColorList().add(Color.ORANGE);
		getColorList().add(Color.WHITE);
	}
	
	// specialty
	@Override
	public void specialty() {
		Util.print(getName() + " make jokes");
	}
	
}
