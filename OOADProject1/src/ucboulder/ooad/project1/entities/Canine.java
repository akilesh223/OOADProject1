package ucboulder.ooad.project1.entities;

public abstract class Canine extends Animal{

	// This implementation of roam is specific to Canines
	public String roam() {
		return " is roaming  aggressively";
	}
	
	// This implementation of eat is specific to Canines
	public String eat() {
		return " is eating meat";
	}
}
