package visitor;

import java.util.Iterator;

/**
 * @author steve
 * Example of visitor pattern.
 * WeightVisitor on a Brick, just prints the details of that brick.
 * On an assembly, iterates over the components in the unit and visits each.
 */
public class FullVisitor extends ComponentVisitor {
	
	public FullVisitor() {}
	
	public void visit (Brick b) {
		
		System.out.print("Brick " + b.getPartNo() + " ");
	}
	
	public void visit (Assembly u) {
		Iterator<Component> it = u.getComponents().iterator();
		System.out.print("Unit " + u.getPartNo() + " [");
		while (it.hasNext()) {
			it.next().accept(this);
		}
		System.out.print("] ");

	}
}