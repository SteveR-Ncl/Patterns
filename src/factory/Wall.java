package factory;

public class Wall extends RoomSide {
	
	public Wall() {};
	
	public void accept (MazeVisitor w) { w.visit(this); }
	
	public String toString() {
		return ""; // printable version of a wall is empty string.
	}
}
