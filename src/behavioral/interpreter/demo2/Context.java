package behavioral.interpreter.demo2;

import java.util.StringTokenizer;

public class Context {
	private StringTokenizer tokenizer;
	private String currentToken;

	public Context(String text) {
		tokenizer = new StringTokenizer(text);
		nextToken();

	}

	public String nextToken() {
		if (tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
		} else {
			currentToken = null;
		}
		return currentToken;
	}
	
	public String currentToken() {
		return currentToken;
	}
	
	public void skipToken(String token) {
		if(!token.equals(currentToken)) {
			System.out.println("������ʾ��" + currentToken + "���ʹ���");
		}
		nextToken();
	}
	
	public int currentNumber() {
		int number=0;
		try {
			number = Integer.parseInt(currentToken);
		}catch(NumberFormatException e) {
			System.out.println("������ʾ��" + e);
		}
		return number;
	}
	
}
