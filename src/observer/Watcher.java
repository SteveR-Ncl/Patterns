package observer;

import java.util.Observer;
import java.util.Observable;


/**
 * @author Steve Riddle
 * 
 * Watcher class: an observer, watches the given temperature gauge (publisher).
 * Instance variable watcherID is index for this watcher: static variable watchers keeps track of number of
 * instances so far.
 * 
 * Update must be implemented: here we simply output the new status every time it changes. 
 * If notifyObservers() was called with a parameter, this would be passed to update() as Object obj.
 *
 */
public class Watcher implements Observer {
	static int watchers = 1;
	int watcherID;
	
	TemperatureGauge publisher;
	
	public Watcher(TemperatureGauge pub){
		this.publisher = pub;
		this.watcherID = watchers;
		watchers++;
	}
	
	public void update(Observable mypub, Object obj){
		System.out.println("Watcher " + watcherID + " sees new status: " + publisher.getStatus());
	}
}
