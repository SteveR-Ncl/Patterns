package visitor;

/**
 * @author steve
 * Example of visitor pattern.
 * Brick, Assembly and Component use composite pattern and define
 * accept method to accept any ComponentVisitor. 
 * Component is abstract class, Brick and Assembly extend Component.
 */
public abstract class Component {
	private String partNo;
	public Component(String partNo) {
		this.partNo = partNo;
	}
	public String getPartNo() { 
		return partNo; 
	}
	public void setPartNo(String partNo) { 
		this.partNo = partNo; 
	}

	public abstract double getWeight();
	public abstract void accept(ComponentVisitor v);
}
