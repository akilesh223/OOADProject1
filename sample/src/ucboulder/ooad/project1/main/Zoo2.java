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
import ucboulder.ooad.project1.entities.ZooAnnouncer;
import ucboulder.ooad.project1.entities.Zookeeper;
import ucboulder.ooad.project1.entities.Zookeeper2;

public class Zoo2 {

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
     
     
     Zookeeper2 zk = new Zookeeper2();
     ZooAnnouncer za = new ZooAnnouncer();
     
     zk.registerZooAnnouncer(za);
     
     System.out.println("---------OPEN ZOO---------------");
     
     zk.openZoo();
     
     System.out.println("-----------ROLL CALL ANIMALS--------------");
     
     //Zookeeper roll calling the animal
     
     zk.rollCallAnimal(lt);
     
     System.out.println("---------WAKEUP ANIMALS----------");
     
     //waking up animals
     zk.wakeAnimal(lt);
     
	 System.out.println("------------EXERCISE ANIMALS----------");
	 
	 //zookeeper exercise animal
	 
	 zk.exerciseAnimal(lt);
     
     
     
	 System.out.println("-------FEED ANIMALS------------");
	 	 
	 
	 //zookeeper feeding animal
	 zk.feedAnimal(lt);
     
     
	 System.out.println("-----------CAT RANDOM BEHAVIOUR----------");
	 	 
	 cooper.randomBehaviour();
	 
	 System.out.println("-------SHUTTING DOWN-----------");
	 
	 zk.shutDownZoo();
	 
	 zk.unRegisterZooAnnouncer(za);
     
}
}
