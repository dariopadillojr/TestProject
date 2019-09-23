package com.telecom.ws.model;

import java.util.ArrayList;

import com.telecom.animal.birdmodel.Rooster;
import com.telecom.animal.trait.Sound;
import com.telecom.constant.Language;

public class RoosterModel extends AnimalModel {

	public RoosterModel() {
		setAnimal(new Rooster().getChicken());
		initLanguages();
	}
	
	/**
	 * Initializes the languages
	 */
	public void initLanguages() {
		
		// this list can be maintained in properties file or DB master table
		ArrayList<AnimalLang> listLang = new ArrayList<AnimalLang>();
		listLang.add(new AnimalLang(Language.ENGLISH, new Sound("Cock-a-doodle-doo")));
		listLang.add(new AnimalLang(Language.DANISH, new Sound("kykyliky")));
		listLang.add(new AnimalLang(Language.DUTCH, new Sound("kukeleku")));
		listLang.add(new AnimalLang(Language.FINNISH, new Sound("kukko kiekuu")));
		listLang.add(new AnimalLang(Language.FRENCH, new Sound("cocorico")));
		
		setListLang(listLang);
		// add more language and sound here
	}
	
}
