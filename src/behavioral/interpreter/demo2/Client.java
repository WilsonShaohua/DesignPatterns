package behavioral.interpreter.demo2;

public class Client {
	public static void main(String[] args) {
		String text = "LOOP 2 LOOP 2 PRINT Ñî¹ý SPACE SPACE PRINT Ð¡ÁúÅ® BREAK END PRINT   ¹ù¾¸ SPACE SPACE PRINT »ÆÈØ    BREAK END";
		Context context = new Context(text);
		Node node = new ExpressionNode();
		node.interpret(context);
		node.execute();
	}
}
