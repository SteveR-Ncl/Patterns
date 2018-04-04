package visitor;

/**
 * @author Steve Riddle
 * Example of visitor pattern.
 * Abstract class ComponentVisitor simply declares abstract Visit methods for visiting
 * Bricks or Units (assembled bricks)
 */
public abstract class ComponentVisitor {
	public abstract void visit(Brick b);
	public abstract void visit(Assembly bb);

	
}