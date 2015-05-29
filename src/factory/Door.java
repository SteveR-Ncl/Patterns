package factory;

public class Door extends RoomSide {
	Room to;
	
	public Door(Room r2) {
		to = r2;
	}
	
	public String toString() {
		return "to Room " + to.getRoomNo();
	}
	
	public Room getNextRoom() {
		return to;
		
	}
	
	public void accept (MazeVisitor v) { v.visit(this); }
}
