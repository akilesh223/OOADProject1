package ucboulder.ooad.project1.entities;

public class Cat extends Feline{

	// this states that by default animal is not in zoo
	boolean status = false;

	String name;

	public Cat(String name){

		this.name = name;

	}

	@Override
	public String getName() {

		return name;

	}

	// returns animal voice
	public String makeNoise() {

		return " is making noise meow meow";

	}

	// to status sets the animal is present in zoo
	public void setStatus() {

		this.status = true;

	}

	@Override
	public boolean getStatus() {

		return status;

	}

	// to generate random number in range (0,4)
	public int getState() {
		return (int) (Math.random()*4); 
	}


	// this methos to implement random behaviour of cat
	public void randomBehaviour() {

		int k = getState();


		switch(k) {

		case 0: System.out.println(getName() +makeNoise());
		break;
		case 1: System.out.println(getName() +eat());
		break;
		case 2: System.out.println(getName() +roam());
		break;
		case 3: System.out.println(getName() +sleep());
		break;
		case 4: System.out.println(getName() +wakeUp());
		break;

		}
	}
}
