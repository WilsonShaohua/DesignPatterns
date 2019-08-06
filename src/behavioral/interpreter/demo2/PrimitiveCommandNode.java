package behavioral.interpreter.demo2;

public class PrimitiveCommandNode extends Node {
	private String name;
	private String text;
	@Override
	public void interpret(Context context) {
		name = context.currentToken();
		context.skipToken(name);
		if(!"PRINT".equals(name) && !"BREAK".equals(name) && !"SPACE".equals(name)) {
			System.out.println("∑«∑®√¸¡Ó£°");
		}
		if("PRINT".equals(name)) {
			text = context.currentToken();
			context.nextToken();
		}
	}

	@Override
	public void execute() {
		if("PRINT".equals(name)) {
			System.out.print(text);
		}else if("SPACE".equals(name)) {
			System.out.print(" ");
		}else if("BREAK".equals(name)) {
			System.out.println();
		}
	}

}
