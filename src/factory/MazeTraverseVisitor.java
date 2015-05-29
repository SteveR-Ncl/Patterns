package factory;

import java.util.ArrayList;
import java.util.Iterator;

public class MazeTraverseVisitor extends MazeVisitor{
	private ArrayList<Room> visitedRooms = new ArrayList<Room>();

	public void visit(Room r){
		if(visitedRooms.contains(r)) {
			System.out.println("Already visited room " + r.roomNum);
		} else {
			visitedRooms.add(r);
			System.out.print("Room number " + r.roomNum + " has exits: ");
			Iterator<Direction> it = r.exits.keySet().iterator();
			boolean aWayOut = false;
			while(it.hasNext()) {

				Direction d = it.next();
				String exitString = r.exits.get(d).toString();
				if (exitString != "") {
					aWayOut = true;
					System.out.print(d + "(" + exitString + ")");
					if (it.hasNext()) { System.out.print("; ");
					}
				}
			}
			if(!aWayOut) { 
				System.out.print("<None>"); 
			}
			System.out.println(); // newline
			// now another iterator to visit those rooms
			it = r.exits.keySet().iterator();
			while(it.hasNext()){
				Direction d = it.next();
				r.exits.get(d).accept(this);
			}
		}
	}

	public void visit(Wall w) {} //  do nothing at all
	
	public void visit(Door d) { // visit the room on the other side 
		d.getNextRoom().accept(this);
	}
	
	public void visit(Maze m) { // visit the first room.
		m.getStartRoom().accept(this);
	}
	
}