package visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author steve
 * Example of visitor pattern.
 * Brick, Unit and Component use composite pattern and define
 * accept method to accept any ComponentVisitor. 
 * Component is abstract class, Brick and Unit extend Component.
 */
public class Unit extends Component {
	private ArrayList<Component> components;
	public Unit (String partNo) {
		super(partNo);
		components = new ArrayList<Component>();
	}
	
	public void addComponent (Component c) {
		components.add(c);
	}

	public void removeComponent (Component c) {
		components.remove(c);
	}
	
	public double getWeight() {
		double totalWeight = 0.0;
		Iterator<Component> it = components.iterator();
		while (it.hasNext()) {
			totalWeight += (it.next()).getWeight();
		}
		return totalWeight;
	}
	
	public ArrayList<Component> getComponents(){
		return components;
	}
	
	public void accept (ComponentVisitor v) { v.visit(this); }
}

