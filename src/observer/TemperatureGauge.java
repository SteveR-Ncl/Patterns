package observer;
import java.util.Observable;

/**
 * @author Steve Riddle
 * 
 * TemperatureGauge publishes its status (Frozen, Cold, Warm, Hot or Too Hot) based on current temperature reading.
 * Initial temperature is 10.0, Cold.
 * 
 * setStatus updates the status string if changed, and notifies all observers of the change.
 *
 */
public class TemperatureGauge extends Observable {
	private String status;
	private double reading;
	
	public TemperatureGauge(){
		this.reading = 10.0;
		this.status = "Cold";
	}
	
	public void setStatus(String newStatus){
		if (newStatus != status) {
			this.status = newStatus;
			setChanged();
			notifyObservers();
		}
	}
	
	public String getStatus() {
		return status;
	}
	
	private void classify() {
		if (reading <=0) {
			setStatus("Frozen");
		} else if (reading > 0 && reading < 20) {
			setStatus("Cold");
		} else if (reading >= 20 && reading < 30) {
			setStatus("Warm");			
		} else if (reading >= 30 && reading < 50) {
			setStatus("Hot");
		} else {
			setStatus("Too Hot");
		}
	}
	
	public void incTemp() {
		reading++;
		this.classify();
	}
	
	public void decTemp() {
		reading--;
		this.classify();
	}
	

	
}
