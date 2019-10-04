package ucboulder.ooad.project1.entities;

import ucboulder.ooad.project1.roamClasses.FelineRoam;

public class Tiger extends Feline{
	
	// this states that by default animal is not in zoo
	boolean status;
	
String name;
	
public Tiger(String name){
		
		this.name = name;
		roamBehaviour = new FelineRoam();
	}
@Override
	public String getName() {
		
		return name;
		
	}
//returns animal voice
	public String makeNoise() {
		
		return " is making noise snarl snarl";
		
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
