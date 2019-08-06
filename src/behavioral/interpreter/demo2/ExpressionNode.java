package behavioral.interpreter.demo2;

import java.util.ArrayList;
import java.util.Iterator;

public class ExpressionNode extends Node {
	private ArrayList<Node> nodes = new ArrayList<Node>();

	@Override
	public void interpret(Context context) {
		while(true) {
			if (null == context.currentToken()) {
				break;
			}else if("END".equalsIgnoreCase(context.currentToken())) {
				context.skipToken("END");
				break;
			}else {
				Node commandNode = new CommandNode();
				commandNode.interpret(context);
				nodes.add(commandNode);
			}
		}
	}

	@Override
	public void execute() {
		Iterator iterator  = nodes.iterator();
		while(iterator.hasNext()) {
			((Node)iterator.next()).execute();
		}
	}

}
