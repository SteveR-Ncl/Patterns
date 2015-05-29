package factory;

public class MazeGame {

	private static final Direction East = Direction.East;
	private static final Direction North = Direction.North;
	private static final Direction South = Direction.South;
	private static final Direction West = Direction.West;

	public Maze createMaze(MazeFactory factory) {
		Maze maze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Room r3 = factory.makeRoom(3);
		Room r4 = factory.makeRoom(4);
		Room r5 = factory.makeRoom(5);
		maze.addRoom(r1);
		maze.addRoom(r2);
		maze.addRoom(r3);
		maze.addRoom(r4);
		maze.addRoom(r5);
		r1.setSide(North, factory.makeWall());
		r1.setSide(East, factory.makeDoor(r2));
		r1.setSide(South, factory.makeWall());
		r1.setSide(West, factory.makeDoor(r4));
		r2.setSide(North, factory.makeWall());
		r2.setSide(East, factory.makeWall());
		r2.setSide(South, factory.makeDoor(r3));
		r2.setSide(West, factory.makeDoor(r1));
		r3.setSide(North, factory.makeDoor(r2));
		r3.setSide(East, factory.makeWall());
		r3.setSide(South, factory.makeDoor(r4));
		r3.setSide(West, factory.makeWall());
		r4.setSide(North, factory.makeDoor(r3)); 
		r4.setSide(East, factory.makeDoor(r1));
		r4.setSide(South, factory.makeWall());
		r4.setSide(West, factory.makeWall());
		r5.setSide(North, factory.makeWall()); // no way into Room 5, so not visited.
		r5.setSide(East, factory.makeWall());
		r5.setSide(South, factory.makeWall());
		r5.setSide(West, factory.makeWall());

		
		maze.setStartRoom(r1);
		
		return maze;
		
	}
}
