package ucboulder.ooad.project1.entities;

public abstract class Animal {

	// animal is sleeping
	public String sleep() {

		return " is sleeping";

	}

	// animal is waking up
	public String wakeUp() {

		return " is waking up";

	}


	// below abstract methods are implemented in their respective sub classes
	
	public abstract String roam();

	public abstract boolean getStatus();

	public abstract String eat();

	public abstract String  makeNoise();

	public abstract String getName();

}
