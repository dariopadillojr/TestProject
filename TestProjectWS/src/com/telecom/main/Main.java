package com.telecom.main;

import com.telecom.animal.birdmodel.Bird;
import com.telecom.animal.birdmodel.Chicken;
import com.telecom.animal.birdmodel.Duck;
import com.telecom.animal.birdmodel.Parrot;
import com.telecom.animal.birdmodel.Rooster;
import com.telecom.animal.fishmodel.Clownfish;
import com.telecom.animal.fishmodel.Dolphin;
import com.telecom.animal.fishmodel.Fish;
import com.telecom.animal.fishmodel.Shark;
import com.telecom.animal.metamorphicmodel.Butterfly;
import com.telecom.animal.model.Animal;
import com.telecom.animal.model.Dog;
import com.telecom.animal.trait.ParrotSound;
import com.telecom.constant.State;
import com.telecom.util.AbilityCounter;
import com.telecom.util.Util;
import com.telecom.ws.model.AnimalModel;
import com.telecom.ws.model.DogModel;
import com.telecom.ws.model.RoosterModel;

public class Main {
	public static void main(String[] args) {
		// SET A
		Util.print("------------------[start] SET A-------------------");
		Animal dog = new Dog();
		
		//dog can walk
		dog.move();
		
		Bird bird = new Bird();
		Bird duck = new Duck();
		Bird chick = new Chicken();
		
		// bird can fly, sounds Tweet, tweet
		bird.move();
		bird.sing();
		
		// duck can swim, sounds Quack, quack
		duck.move();
		duck.sing();
		
		// chicken cannot fly, sounds Cluck, cluck
		chick.move();
		chick.sing();
		
		Rooster rooster = new Rooster();
		
		// rooster cannot fly, sounds Cock-a-doodle-doo
		rooster.move();
		rooster.sing();
		
		Parrot parrot1 = new Parrot(new ParrotSound("Woof, woof"));
		Parrot parrot2 = new Parrot(new ParrotSound("Meow"));
		Parrot parrot3 = new Parrot(new ParrotSound("Cock-a-doodle-doo"));
		
		// parrot 1 sings Woof, woof
		parrot1.sing();
		
		// parrot 2 sings Meow
		parrot2.sing();
		
		// parrot 3 sings Cock-a-doodle-doo
		parrot3.sing();
		
		Util.print("------------------[end] SET A-------------------");
		Util.print("------------------[start] SET B-------------------");
		
		// SET B
		Fish shark = new Shark();
		Fish clownFish = new Clownfish();
		Dolphin dolphin = new Dolphin();
		
		// shark is size and color
		Util.print(shark.toString());
		
		// shark can swim and specialty
		shark.swim();
		shark.specialty();
		
		// clownfish is size and color
		Util.print(clownFish.toString());
				
		// clownfish can swim and specialty
		clownFish.swim();
		clownFish.specialty();
		
		// dolphin can swim
		dolphin.swim();
		
		Util.print("------------------[end] SET B-------------------");
		Util.print("------------------[start] SET D-------------------");
		
		// SET D
		Butterfly butterfly = new Butterfly(State.STAGE_EGG);
		
		// egg state
		butterfly.metamorphic();
		
		// caterpillar state, i can crawl
		butterfly.setState(State.STAGE_CHILD);
		butterfly.metamorphic();
		
		// adult state, i can fly
		butterfly.setState(State.STAGE_ADULT);
		butterfly.metamorphic();
		
		Util.print("------------------[end] SET D-------------------");
		Util.print("------------------[start] SET E-------------------");
		
		// SET E
		AbilityCounter counter = new AbilityCounter();
		counter.countAbilityTest();
		Util.print("------------------[end] SET E-------------------");
		Util.print("------------------[start] SET BONUS 1-------------------");
		
		// BONUS 1
		AnimalModel roosterModel = new RoosterModel();
		AnimalModel dogModel = new DogModel();
		
		Util.print(roosterModel.toString());
		Util.print(dogModel.toString());
		Util.print("------------------[end] SET BONUS 1-------------------");
		
		
		Util.print("------------------[start] SET BONUS 2-------------------");
		// BONUS 2
		Util.print("Please refer to the these packages/files:");
		Util.print("a. /TestProjectWS/src/com/telecom/ws/model");
		Util.print("b. /TestProjectWS/src/com/telecom/ws/service");
		Util.print("c. /TestProjectWS/WebContent/WEB-INF/web.xml");
		Util.print("------------------[end] SET BONUS 2-------------------");
	}
}
