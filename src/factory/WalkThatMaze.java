package factory;

public class WalkThatMaze {

	public static void main(String[] args) {
		Maze maze = new MazeGame().createMaze(new MazeFactory());
		maze.accept(new MazeTraverseVisitor());
	}

}
