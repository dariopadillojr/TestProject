package com.telecom.animal.trait;


public class Sound {
	private String sound;

	public Sound() {}
	
	public Sound(String sound) {
		this.sound=sound;
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append(this.sound);
		
		return s.toString();
	}
}
