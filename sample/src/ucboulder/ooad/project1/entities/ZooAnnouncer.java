package ucboulder.ooad.project1.entities;

import ucboulder.ooad.project1.interfaces.ZooAnnouncerInterface;

public class ZooAnnouncer implements ZooAnnouncerInterface{

	public void updateZoo(String announcement) {
	
		System.out.println("ZooAnnouncer : " + "\"" + announcement +"\"");
		
	}
	
}
