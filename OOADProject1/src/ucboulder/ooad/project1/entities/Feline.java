package ucboulder.ooad.project1.entities;

public abstract class Feline extends Animal{

	// This implementation of roam is specific to Felines
	public String roam() {
		return " is roaming quietly";
	}
	
	// This implementation of roam is specific to Felines
	public String eat() {
		return " is eating light meat";
	}
	
}
