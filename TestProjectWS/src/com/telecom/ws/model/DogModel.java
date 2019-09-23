package com.telecom.ws.model;

import java.util.ArrayList;

import com.telecom.animal.model.Dog;
import com.telecom.animal.trait.Sound;
import com.telecom.constant.Language;

public class DogModel extends AnimalModel {

	public DogModel() {
		setAnimal(new Dog());
		initLanguages();
	}
	
	/**
	 * Initializes the languages
	 */
	public void initLanguages() {
		
		// this list can be maintained in properties file or DB master table
		ArrayList<AnimalLang> listLang = new ArrayList<AnimalLang>();
		listLang.add(new AnimalLang(Language.ENGLISH, new Sound("Woof_English")));
		listLang.add(new AnimalLang(Language.DANISH, new Sound("Woof_Danish")));
		listLang.add(new AnimalLang(Language.DUTCH, new Sound("Woof_Dutch")));
		listLang.add(new AnimalLang(Language.FINNISH, new Sound("Woof_Finnish")));
		listLang.add(new AnimalLang(Language.FRENCH, new Sound("Woof_French")));
		
		setListLang(listLang);
		// add more language and sound here
	}
	
}
