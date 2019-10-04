package ucboulder.ooad.project1.entities;

import ucboulder.ooad.project1.roamClasses.PachydermRoam;

public class Hippo extends Pachyderm{

	// this states that by default animal is not in zoo
	boolean status;
	
String name;
	
public Hippo(String name){
		
		this.name = name;
		roamBehaviour = new PachydermRoam();
	}
@Override
	public String getName() {
		
		return name;
		
	}
	
//returns animal voice
	public String makeNoise() {
		
		return " is making noise growl growl";
		
	}
	
	// to status sets the animal is present in zoo
public void setStatus() {
		
		this.status = true;
		
	}

@Override
public boolean getStatus() {
	
	return status;
}
	
}
