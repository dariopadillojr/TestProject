package com.telecom.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.telecom.animal.birdmodel.Bird;
import com.telecom.animal.birdmodel.Chicken;
import com.telecom.animal.birdmodel.Duck;
import com.telecom.animal.birdmodel.Parrot;
import com.telecom.animal.fishmodel.Clownfish;
import com.telecom.animal.fishmodel.Shark;
import com.telecom.animal.metamorphicmodel.Butterfly;
import com.telecom.animal.model.Animal;
import com.telecom.animal.model.Dog;
import com.telecom.constant.Ability;

public class AbilityCounter {
	private static final Animal[] animals = new Animal[]{
			 new Bird(),
			 new Duck(),
			 new Chicken(),
			 new Parrot(),
			 new Shark(),
			 new Clownfish(),
			 new Dog(),
			 new Butterfly()
	};
	
	private static List<Class> flyExceptionList;
	
	public static List<Class> getFlyExceptionList() {
		return flyExceptionList;
	}

	public AbilityCounter( ) {
		initFlyExceptionList();
	}
	
	/**
	 * Initialize the list without fly capability
	 */
	private void initFlyExceptionList() {
		flyExceptionList = new ArrayList<Class>();
		flyExceptionList.add(Chicken.class);
		flyExceptionList.add(Duck.class);
	}
	
	/**
	 * Count by ability
	 * @param ability
	 * @return
	 */
	 public int countAbility(Ability ability) {
		 int count=0;
		 
		 for(Animal animal: animals) {
			 Class className = animal.getClass();
			 
			 int idxStart = animal.getClass().getName().lastIndexOf(".") + 1;
			 
			 // skip animals in exception list
			 if (Ability.FLY==ability) {
				 if(getFlyExceptionList().contains(className)) {
					 Util.print(animal.getClass().getName().substring(idxStart) + " cannot " + ability); 
						continue;
				 }
			 }
	
			 try {
				 Method m = className.getMethod(ability.toString().toLowerCase());
				 
				 if (null != m) {	 
					 Util.print(animal.getClass().getName().substring(idxStart) + " can " + ability); 
					 count++;
				 }	
				 
			 } catch (Exception e) {
				continue;
			}
	
		 }
		 
		 return count;
	 }
	 
	 /**
	  * Testing for ability count
	  */
	 public void countAbilityTest() {
		 AbilityCounter counter = new AbilityCounter();
		 int flyCount = counter.countAbility(Ability.FLY);
		 int walkCount = counter.countAbility(Ability.WALK);
		 int singCount = counter.countAbility(Ability.SING);
		 int swimCount = counter.countAbility(Ability.SWIM);
		 
		 StringBuffer sb = new StringBuffer();
		 sb.append("fly=" + flyCount );
		 sb.append("\nwalk=" + walkCount );
		 sb.append("\nsing=" + singCount );
		 sb.append("\nswim=" + swimCount );
		 
		 Util.print(sb.toString());
		 
	 }
	 
}
