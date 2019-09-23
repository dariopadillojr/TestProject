package com.telecom.ws.model;

import com.telecom.animal.trait.Sound;
import com.telecom.constant.Language;

public class AnimalLang {
	private Language lang;
	private Sound sound;
	
	public AnimalLang() {}
	
	public AnimalLang(Language lang, Sound sound) {
		this.lang=lang;
		this.sound=sound;
	}
	
	public Sound getSound() {
		return sound;
	}
	public void setSound(Sound sound) {
		this.sound = sound;
	}
	public Language getLang() {
		return lang;
	}
	public void setLang(Language lang) {
		this.lang = lang;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(lang + "=" + sound.getSound());
		
		return sb.toString();
	}
	
	
}
