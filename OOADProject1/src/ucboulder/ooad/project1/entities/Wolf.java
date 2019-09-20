package ucboulder.ooad.project1.entities;

public class Wolf extends Canine{
	
	// this states that by default animal is not in zoo
	boolean status;

String name;
	
public Wolf(String name){
		
		this.name = name;
		
	}
@Override
	public String getName() {
		
		return name;
		
	}
//returns animal voice
	public String makeNoise() {
		
		return " is making noise howl howl";
		
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
