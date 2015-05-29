package factory;

public abstract class MazeVisitor {
	public abstract void visit(Room r);
	
	public abstract void visit(Wall w);
	
	public abstract void visit(Door d);
	
	public abstract void visit(Maze m);

}
