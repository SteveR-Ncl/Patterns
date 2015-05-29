package factory;

import java.util.ArrayList;

public class Maze {

	private ArrayList<Room> rooms;
	private Room startRoom;
	
	public Maze() {
		rooms = new ArrayList<Room>();	
	}
	
	public void addRoom(Room r1) {
		rooms.add(r1);		
	}
	
	public void setStartRoom(Room r) { startRoom = r; }
	
	public Room getStartRoom() { return startRoom; }
	
	public void accept(MazeVisitor v) { v.visit(this);}

}
