package visitor;

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
