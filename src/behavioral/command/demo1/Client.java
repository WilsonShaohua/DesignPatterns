package behavioral.command.demo1;

public class Client {

	public static void main(String[] args) {
		FBSettiongWindow fBSettiongWindow = new FBSettiongWindow("���ܰ�������");
		
		FunctionButton functionButton1,functionButton2;
		functionButton1 = new FunctionButton("���ܼ�1");
		functionButton2 = new FunctionButton("���ܼ�2");			
		
		Command command1,command2;
		
		command1 = (Command) XMLUtil.getBean(0);
		command2 = (Command) XMLUtil.getBean(1);
		
		functionButton1.setCommond(command1);
		functionButton2.setCommond(command2);
		
		fBSettiongWindow.addFunctionButton(functionButton1);
		fBSettiongWindow.addFunctionButton(functionButton2);
		
		fBSettiongWindow.display();
		functionButton1.onClick();
		functionButton2.onClick();
	}

}
