package visitor;


public class SimpleVisitor extends ComponentVisitor {
	public SimpleVisitor() {}
	
	public void visit (Brick b) {
		System.out.println("Visiting a brick with part number " + b.getPartNo());
	}
	
	public void visit (Unit bb) {
		System.out.println("Visiting a pile of bricks.");
	}
}

