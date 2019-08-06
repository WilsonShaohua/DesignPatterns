package behavioral.interpreter.demo1;

public class AndNode extends AbstractNode {
	private AbstractNode left;
	private AbstractNode right;
	
	public AndNode(AbstractNode left,AbstractNode right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public String interpret() {
		return left.interpret() + "ты" + right.interpret();
	}
}
