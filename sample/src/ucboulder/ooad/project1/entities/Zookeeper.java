package ucboulder.ooad.project1.entities;

public class Zookeeper {

	// zookeeper wakes animal that is instructed to him by zoo
	public String wakeAnimal(Animal animal) {
		 return animal.wakeUp();
	}
	
	// zookeeper check for animal that is instructed to him by zoo
	public boolean rollCallAnimal(Animal animal) {
	 return animal.getStatus();
	}
	
	// zookeeper feeds animal that is instructed to him by zoo and as a response they eat
	public String feedAnimal(Animal animal) {
		
		return animal.eat();
       
	}
	
	// zookeeper exercise animal that is instructed to him by zoo and as a response they roam
	public String exerciseAnimal(Animal animal) {


		return animal.roam();
	}
	
	
	// zookeeper shuts down the zoo
	public void shutDownZoo() {
		System.out.println("Shut Down Zoo");
	}
	
	//zookeeper opens the zoo
	public void openZoo() {
		System.out.println("Open Zoo");
	}
	
}
