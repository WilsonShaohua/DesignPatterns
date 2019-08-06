package behavioral.interpreter.demo2;

public class CommandNode extends Node {
	private Node node;
	@Override
	public void interpret(Context context) {
		if("LOOP".equals(context.currentToken())) {
			node = new LoopCommandNode();
			node.interpret(context);
		}else {
			node = new PrimitiveCommandNode();
			node.interpret(context);
		}
	}

	@Override
	public void execute() {
		node.execute();
	}

}
