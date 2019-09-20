package ucboulder.ooad.project1.entities;

public class Elephant extends Pachyderm{

	// this states that by default animal is not in zoo
	boolean status = false;
	
String name;
	
public Elephant(String name){
		
		this.name = name;
		
	}
	
   @Override
	public String getName() {
		
		return name;
		
	}
	
// to status sets the animal is present in zoo
public void setStatus() {
		
		this.status = true;
		
	}
	
//returns animal voice
public String makeNoise() {
	
	return " is making noise trumpet trumpet";
	
}

	@Override
	public boolean getStatus() {
		
		return status;
	}
}
