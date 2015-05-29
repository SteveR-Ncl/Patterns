package factory;

import java.util.HashMap;

public class Room {
	int roomNum;
	
	HashMap<Direction, RoomSide> exits;
	
	public Room(int n) { 
		roomNum = n ; 
		exits = new HashMap<Direction, RoomSide>();}

	public void setSide(Direction nesw, Door door) {
		exits.put(nesw, door);
		
	}

	public void setSide(Direction nesw, Wall wall) {
		exits.put(nesw, wall);
		
	}

	public int getRoomNo() {
		return roomNum;
	}	
	
	public void accept (MazeVisitor v) { v.visit(this);}

	
}
