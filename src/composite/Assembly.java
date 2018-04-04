package composite;

import java.util.ArrayList;

/**
 * @author steve
 * Example of composite pattern.
 * Brick, Assembly and Component use composite pattern. 
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
	

}

