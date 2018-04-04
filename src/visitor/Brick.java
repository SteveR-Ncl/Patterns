package visitor;

/**
 * @author Steve Riddle
 * Example of visitor pattern.
 * Brick, Assembly and Component use composite pattern and define
 * accept method to accept any ComponentVisitor
 */
public class Brick extends Component {
	public Brick(String partNo) {
		super(partNo);
	}


	public void accept (ComponentVisitor v) { 
		v.visit(this);
	}
}