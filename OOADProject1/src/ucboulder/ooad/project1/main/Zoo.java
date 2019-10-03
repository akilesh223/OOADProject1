package ucboulder.ooad.project1.main;

import java.util.ArrayList;
import java.util.List;

import ucboulder.ooad.project1.entities.Animal;
import ucboulder.ooad.project1.entities.Cat;
import ucboulder.ooad.project1.entities.Dog;
import ucboulder.ooad.project1.entities.Elephant;
import ucboulder.ooad.project1.entities.Hippo;
import ucboulder.ooad.project1.entities.Lion;
import ucboulder.ooad.project1.entities.Rhino;
import ucboulder.ooad.project1.entities.Tiger;
import ucboulder.ooad.project1.entities.Wolf;
import ucboulder.ooad.project1.entities.Zookeeper;

//ignore
public class Zoo {

	public static void main(String[] args) {
		
     Cat cooper = new Cat("Cooper"); cooper.setStatus();
     Cat chandler = new Cat("Chandler"); 
		
     Dog danny = new Dog("Danny"); danny.setStatus();
     Dog debby = new Dog("Debby");
     
     Elephant elda = new Elephant("Elda"); elda.setStatus();
     Elephant emma = new Elephant("Emma"); 
     
     
     Hippo howard = new Hippo("Howard"); howard.setStatus();
     Hippo  hofstedar= new Hippo("Hofstedar"); 
     
     Lion lilly = new Lion("Lilly"); lilly.setStatus();
     Lion  lita= new Lion("Lita"); 
     
      
     Rhino rachel = new Rhino("Rachel"); rachel.setStatus();
     Rhino  ross= new Rhino("Ross"); 
      
     Tiger tony = new Tiger("Tony"); tony.setStatus();
     Tiger  timmy= new Tiger("Timmy"); 
     
     Wolf wendy = new Wolf("Wendy");  wendy.setStatus();
     Wolf  william= new Wolf("William"); 
     
     List<Animal> lt = new ArrayList<Animal>();
     lt.add(cooper);
     lt.add(chandler);
     lt.add(danny);
     lt.add(debby);
     lt.add(elda);
     lt.add(emma);
     lt.add(howard);
     lt.add(hofstedar);
     lt.add(lilly);
     lt.add(lita);
     lt.add(rachel);
     lt.add(ross);
     lt.add(tony);
     lt.add(timmy);
     lt.add(wendy);
     lt.add(william);
     
     
     Zookeeper zk = new Zookeeper();
     
     System.out.println("---------OPEN ZOO---------------");
     
     zk.openZoo();
     
     System.out.println("-----------ROLL CALL ANIMALS--------------");
     
     //Zookeeper roll calling the animal
     for(Animal animal : lt) {
    	 
    	 if(zk.rollCallAnimal(animal)) {
    		 
    		 System.out.println(animal.getName()+" is Present");
    		
    	 }else {
    		 System.out.println(animal.getName()+" is not Present");
    	 }
    	 
     }
     
     System.out.println("---------WAKEUP ANIMALS----------");
     
     
     //Zookepper wake up animal
     for(Animal animal : lt) {
    	 if(animal.getStatus())
    	 System.out.println(animal.getName()+zk.wakeAnimal(animal)); 
     }
     
     
     
	 System.out.println("------------EXERCISE ANIMALS----------");
	 
	 //zookeeper exercise animal
	 for(Animal animal : lt) {
		 if(animal.getStatus())
    	 System.out.println(animal.getName()+zk.exerciseAnimal(animal)); 
     }
     
     
     
	 System.out.println("-------FEED ANIMALS------------");
	 	 
	 
	 //zookeeper feeding animal
	 for(Animal animal : lt) {
		 if(animal.getStatus())
    	 System.out.println(animal.getName()+zk.feedAnimal(animal)); 
     }
     
     
     
	 System.out.println("-----------CAT RANDOM BEHAVIOUR----------");
	 	 
	 cooper.randomBehaviour();
	 
	 System.out.println("-------SHUTTING DOWN-----------");
	 
	 zk.shutDownZoo();
     
}
}
