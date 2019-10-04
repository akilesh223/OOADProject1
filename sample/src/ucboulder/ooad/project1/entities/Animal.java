package ucboulder.ooad.project1.entities;

import ucboulder.ooad.project1.interfaces.RoamBehaviour;

public abstract class Animal {
	
	RoamBehaviour roamBehaviour;

	// animal is sleeping
	public String sleep() {

		return " is sleeping";

	}

	// animal is waking up
	public String wakeUp() {

		return " is waking up";

	}


	// below abstract methods are implemented in their respective sub classes
	
	public  String roam() {
		return roamBehaviour.roam();
	}

	public abstract boolean getStatus();

	public abstract String eat();

	public abstract String  makeNoise();

	public abstract String getName();

}
