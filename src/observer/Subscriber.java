package observer;

import java.util.Observer;
import java.util.Observable;

public class Subscriber implements Observer {
	private StreamFrame stream;
	private Publisher publisher;
	
	public Subscriber(Publisher pub, StreamFrame stream){
		this.stream = stream;
		this.publisher = pub;
	}
	
	public void update(Observable mypub, Object obj){
		stream.addLine(publisher.getStatus());	
	}
}
