package visitor;

public abstract class ComponentVisitor {
	public abstract void visit(Brick b);
	public abstract void visit(Unit u);
}