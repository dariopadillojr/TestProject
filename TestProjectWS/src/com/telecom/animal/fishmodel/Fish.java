package com.telecom.animal.fishmodel;

import java.util.ArrayList;

import com.telecom.animal.interfaces.FishInterface;
import com.telecom.animal.model.Animal;
import com.telecom.constant.Color;
import com.telecom.constant.Size;
import com.telecom.util.Util;

public abstract class Fish extends Animal implements FishInterface {
	private String name="Fish";
	private Size size;
	private ArrayList<Color> colorList = new ArrayList<Color>();
	
	//fish specialty
	public abstract void specialty();
	
	public void move() {
		swim();
	}
	
	public void swim() {
		Util.print(getName() + " can swim");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public ArrayList<Color> getColorList() {
		return colorList;
	}

	public void setColorList(ArrayList<Color> colorList) {
		this.colorList = colorList;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(getName() + "=");
		sb.append("Size::" + getSize());
		sb.append(" Color::" + getColorList().toString());
		
		return sb.toString();
	}
	
}
