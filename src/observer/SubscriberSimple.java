package observer;

import java.util.Observer;
import java.util.Observable;

public class SubscriberSimple implements Observer {
	private Publisher publisher;
	private StreamOutput out;
	
	public SubscriberSimple(Publisher pub, String name){
		this.out = new StreamOutput(name);
		this.publisher = pub;
	}
	
	public void update(Observable mypub, Object obj){
		if (mypub.equals(publisher)){
			out.addLine(publisher.getStatus());	
		}
	}
}
