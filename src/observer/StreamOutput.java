package observer;

public class StreamOutput {
		
	private String name;
	
	public StreamOutput(String name){
		this.name = name;
	}
	
	public void addLine(String text){
		System.out.println(this.name + ">: " + text);
	}
}
