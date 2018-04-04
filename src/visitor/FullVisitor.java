package visitor;

import java.util.Iterator;

/**
 * @author steve
 * Example of visitor pattern.
 * FullVisitor traverses assembly of components and prints part numbers
 */
public class FullVisitor extends ComponentVisitor {
	public FullVisitor() {}
	
	public void visit (Brick b) {
		System.out.print("Brick " + b.getPartNo() + " ");
	}
	
	public void visit (Assembly bb) {
		Iterator<Component> it = bb.getComponents().iterator();
		System.out.print("Unit " + bb.getPartNo() + " [");
		while (it.hasNext()) {
			it.next().accept(this);
		}
		System.out.print("] ");
		
	}
}

