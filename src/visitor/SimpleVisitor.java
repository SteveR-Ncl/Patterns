package visitor;


/**
 * @author steve
 * Example of visitor pattern.
 * SimpleVisitor outputs the element it's visiting
 */
public class SimpleVisitor extends ComponentVisitor {
	public SimpleVisitor() {}
	
	public void visit (Brick b) {
		System.out.println("Visiting a brick with part number " + b.getPartNo());
	}
	
	public void visit (Unit bb) {
		System.out.println("Visiting a pile of bricks.");
	}
}

