package visitor;

/**
 * @author Steve Riddle
 * Example of visitor pattern.
 * Interface ComponentVisitor simply declares abstract Visit methods for visiting
 * Bricks or Units (assembled bricks)
 */
public interface ComponentVisitor {
	public void visit(Brick b);
	public void visit(Assembly bb);

	
}