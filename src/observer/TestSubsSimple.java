package observer;

public class TestSubsSimple {

	public static void main(String[] args) {
		Publisher eric = new Publisher("Eric");
		
		SubscriberSimple chris = new SubscriberSimple(eric, "Chris");
		SubscriberSimple pat = new SubscriberSimple(eric, "Pat");
		eric.addObserver(pat);
		eric.addObserver(chris);
		
		eric.setStatus("taking photo of lunch");
		eric.setStatus("working on Software Engineering coursework");
		
		eric.deleteObserver(chris);
		eric.setStatus("taking photo of cat");
	
	}
}
