package ucboulder.ooad.project1.entities;

import java.util.ArrayList;
import java.util.List;

import ucboulder.ooad.project1.interfaces.ZooKeeperInterface;

public class Zookeeper2 implements ZooKeeperInterface {
	
	//ZooAnnouncer za = new ZooAnnouncer();
	private List<ZooAnnouncer> zaList;
	
	public Zookeeper2(){
		
		zaList  = new ArrayList<ZooAnnouncer>(); 
		
	}
	
	//zookeeper opens the zoo
		public void openZoo() {
			notifyZooAnnouncer("Zookeeper is opening Zoo");
			System.out.println("Open Zoo");
		}
	
	// zookeeper wakes animal that is instructed to him by zoo
	public void wakeAnimal(List<Animal> animals) {
		
		notifyZooAnnouncer("Zookeeper is waking Animals");
		
		for(int i=0;i<animals.size();i++)
		
		 System.out.println(animals.get(i).getName() + animals.get(i).wakeUp());
	}
	
	// zookeeper check for animal that is instructed to him by zoo
	public void rollCallAnimal(List<Animal> animals) {
		notifyZooAnnouncer("Zookeeper is roll calling Animals");
		
		for(int i=0;i<animals.size();i++)
			
			 System.out.println(animals.get(i).getName() + (animals.get(i).getStatus() ? " is Present" : " is not Present"));
	}
	
	// zookeeper feeds animal that is instructed to him by zoo and as a response they eat
	public void feedAnimal(List<Animal> animals) {
		
		notifyZooAnnouncer("Zookeeper is feeding Animals");
		
		for(int i=0;i<animals.size();i++)
			
			 System.out.println(animals.get(i).getName() + animals.get(i).eat());
       
	}
	
	// zookeeper exercise animal that is instructed to him by zoo and as a response they roam
	public void exerciseAnimal(List<Animal> animals) {

		notifyZooAnnouncer("Zookeeper is exercising Animals");
		
		for(int i=0;i<animals.size();i++)
			
			 System.out.println(animals.get(i).getName() + animals.get(i).roam());
      
	}
	
	
	// zookeeper shuts down the zoo
	public void shutDownZoo() {
		notifyZooAnnouncer("Zookeeper is shutting down");
		
		System.out.println("Shut Down Zoo");
	}

	@Override
	public void registerZooAnnouncer(ZooAnnouncer za) {
		zaList.add(za);
		
	}

	@Override
	public void unRegisterZooAnnouncer(ZooAnnouncer za) {
		zaList.remove(za);
		
	}

	@Override
	public void notifyZooAnnouncer(String announcement) {
		
		for(ZooAnnouncer za : zaList) {
			za.updateZoo(announcement);
		}
		
	}
	
	
	
}
