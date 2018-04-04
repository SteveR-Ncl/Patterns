package visitor;

import java.util.ArrayList;

/**
 * @author Steve Riddle
 * Example of visitor pattern.
 * Brick, Assembly and Component use composite pattern and define
 * accept method to accept any ComponentVisitor. 
 * Component is abstract class, Brick and Assembly extend Component.
 */
public class Assembly extends Component {
	private ArrayList<Component> components;
	public Assembly (String partNo) {
		super(partNo);
		components = new ArrayList<>();
	}
	
	public void addComponent (Component c) {
		components.add(c);
	}

	public void removeComponent (Component c) {
		components.remove(c);
	}
	
	public ArrayList<Component> getComponents(){
		return components;
	}
	
	public void accept (ComponentVisitor v) { v.visit(this); }
}

