package observer;
import java.util.Observable;

public class Publisher extends Observable {
	private String status;
	private String name;
	
	public Publisher(String name){
		this.name = name;
		this.status = "";
	}
	
	public void setStatus(String newStatus){
		this.status = name + " is " + newStatus;
		setChanged();
		notifyObservers();
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getName() {
		return name;
	}
	
}
