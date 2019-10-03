package ucboulder.ooad.project1.entities;

import java.util.List;

public class Zookeeper2 {

	//zookeeper opens the zoo
		public void openZoo() {
			System.out.println("Open Zoo");
		}
	
	// zookeeper wakes animal that is instructed to him by zoo
	public void wakeAnimal(List<Animal> animals) {
		
		for(int i=0;i<animals.size();i++)
		
		 System.out.println(animals.get(i).getName() + animals.get(i).wakeUp());
	}
	
	// zookeeper check for animal that is instructed to him by zoo
	public void rollCallAnimal(List<Animal> animals) {
		for(int i=0;i<animals.size();i++)
			
			 System.out.println(animals.get(i).getName() + (animals.get(i).getStatus() ? " is Present" : " is not Present"));
	}
	
	// zookeeper feeds animal that is instructed to him by zoo and as a response they eat
	public void feedAnimal(List<Animal> animals) {
		
		for(int i=0;i<animals.size();i++)
			
			 System.out.println(animals.get(i).getName() + animals.get(i).eat());
       
	}
	
	// zookeeper exercise animal that is instructed to him by zoo and as a response they roam
	public void exerciseAnimal(List<Animal> animals) {


		for(int i=0;i<animals.size();i++)
			
			 System.out.println(animals.get(i).getName() + animals.get(i).roam());
      
	}
	
	
	// zookeeper shuts down the zoo
	public void shutDownZoo() {
		System.out.println("Shut Down Zoo");
	}
	
	
	
}
