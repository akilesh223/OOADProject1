package ucboulder.ooad.project1.interfaces;

import ucboulder.ooad.project1.entities.ZooAnnouncer;

public interface ZooKeeperInterface {
    void registerZooAnnouncer(ZooAnnouncer za);
    void unRegisterZooAnnouncer(ZooAnnouncer za);
    
    void notifyZooAnnouncer(String announcement);
    
}
