package visitor;

/**
 * @author steve
 * Example of visitor pattern.
 * Brick, Assembly and Component use composite pattern and define
 * accept method to accept any ComponentVisitor
 */
public class Brick extends Component {
	private double weight;
	public Brick(String partNo, double weight) {
		super(partNo);
		this.weight = weight;
	}

	public void setWeight(double weight) { 
		this.weight = weight; 
	}

	public double getWeight() { 
		return weight; 
	}

	public void accept (ComponentVisitor v) { 
		v.visit(this);
	}
}