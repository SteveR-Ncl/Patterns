package observer;

/**
 * @author Steve Riddle
 * 
 * Test harness for temperature gauge (observer pattern) example
 *
 */
public class TestSubsSimple {

	public static void main(String[] args) {
		TemperatureGauge thermometer = new TemperatureGauge();
		
		Watcher w1 = new Watcher(thermometer);
		Watcher w2 = new Watcher(thermometer);
		
		thermometer.addObserver(w2);
		thermometer.addObserver(w1);
		
		System.out.println("Heating up...");
		while(thermometer.getStatus() != "Too Hot") {
			thermometer.incTemp();
		}
		
		thermometer.deleteObserver(w1);

		System.out.println("Rapid cool down");
		while(thermometer.getStatus() != "Frozen") {
			thermometer.dec10Temp();
		}
		
	
	}
}
