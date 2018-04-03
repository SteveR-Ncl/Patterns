package visitor;

import java.util.Iterator;

/**
 * @author steve
 * Example of visitor pattern.
 * WeightVisitor on a Brick, just prints the details of that brick.
 * On an assembly, iterates over the components in the unit and visits each.
 */
public class WeightVisitor extends ComponentVisitor {
	private  String indent = "";
	
	public WeightVisitor() {}
	
	public void visit (Brick b) {
		
		System.out.println(indent + " Brick " + b.getPartNo() + ", weight " + b.getWeight() + ".");
	}
	
	public void visit (Assembly u) {
		Iterator<Component> it = u.getComponents().iterator();
		indent = indent.concat("+");
		System.out.println("------------");
		System.out.println(indent + " Unit " + u.getPartNo() + ":");
		while (it.hasNext()) {
			it.next().accept(this);
		}
		System.out.println(indent + " Total weight of unit: " + u.getWeight() + "."); 
		System.out.println("------------");
		indent = indent.substring(0, indent.length()-1);

	}
}