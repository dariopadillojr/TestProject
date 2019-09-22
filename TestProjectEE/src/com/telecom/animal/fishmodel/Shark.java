package com.telecom.animal.fishmodel;

import com.telecom.constant.Color;
import com.telecom.constant.Size;
import com.telecom.util.Util;

public class Shark extends Fish {
	private static final String NAME="Shark";
	
	public Shark() {
		setName(NAME);
		setSize(Size.LARGE);
		getColorList().add(Color.GRAY);
	}
	
	// specialty
	@Override
	public void specialty() {
		Util.print(getName() + " eat other fish");
	}
	
}
