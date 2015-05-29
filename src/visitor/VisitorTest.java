package visitor;

/**
 * @author steve
 * Sets up a collection of bricks, assembles into units,
 * visits with a weightvisitor. 
 */
public class VisitorTest {
	public static void main (String[] args) {
		// Create bricks
		Brick b1 = new Brick("Red001", 5.0);
		Brick b2 = new Brick("Blue004", 2.0);
		Brick b3 = new Brick("Red002", 8.0);
		Brick b4 = new Brick("Green992", 10.0);
		Brick b5 = new Brick("Blue011", 4.0);
		Brick b6 = new Brick("Black001", 10.0);
		
		
		// Stick some together
		Unit u1 = new Unit("Lump1");
		u1.addComponent(b1);
		u1.addComponent(b2);
		u1.addComponent(b3);
		Unit u2 = new Unit("Lump2");
		u2.addComponent(b4);
		u2.addComponent(b5);
		Unit u3 = new Unit("Lump3");
		u3.addComponent(b6);
		u3.addComponent(u1);
		u3.addComponent(u2);

		
		// Visit top node with a WeightVisitor.
		WeightVisitor wv = new WeightVisitor();
		u3.accept(wv);
	}
}