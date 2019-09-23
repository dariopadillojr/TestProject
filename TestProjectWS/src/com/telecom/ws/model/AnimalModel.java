package com.telecom.ws.model;

import java.util.List;

import com.telecom.animal.model.Animal;


public abstract class AnimalModel {
	private Animal animal;
	private List<AnimalLang>  listLang;
	
	// forces the model to initialized the languages
	public abstract void initLanguages();
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	public List<AnimalLang> getListLang() {
		return listLang;
	 }

	public void setListLang(List<AnimalLang> listLang) {
		this.listLang = listLang;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("name=" + animal.getName());
		sb.append("\nlanguages=" + listLang.toString());
		
		return sb.toString();
	}
	
}
