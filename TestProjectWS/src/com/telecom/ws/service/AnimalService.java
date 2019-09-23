package com.telecom.ws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.telecom.constant.Animal;
import com.telecom.util.Util;
import com.telecom.ws.model.AnimalModel;
import com.telecom.ws.model.DogModel;
import com.telecom.ws.model.RoosterModel;

@Path("/animal")
public class AnimalService {

	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  @Path("{animalName}")
	  public AnimalModel getModelJson(@PathParam("animalName") String animalName) { 
		  AnimalModel animalModelResp = null;
		  
		  if (!Util.isEmpty(animalName)) {
			  if(Animal.ROOSTER.toString().equalsIgnoreCase(animalName)) {
				  animalModelResp = new RoosterModel();
			  } else if(Animal.DOG.toString().equalsIgnoreCase(animalName)) {
				  animalModelResp = new DogModel();
			  } else {
				  return null;
			  }
				  
		  } else {
			  return null;
		  }
		  
		 
		  return animalModelResp; 
	  }
	 
}
