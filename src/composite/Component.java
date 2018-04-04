package composite;

/**
 * @author steve
 * Example of composite pattern.
 *
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


}
