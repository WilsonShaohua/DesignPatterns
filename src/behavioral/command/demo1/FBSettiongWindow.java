package behavioral.command.demo1;

import java.util.ArrayList;

public class FBSettiongWindow {
	private String title;
	private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();
	public FBSettiongWindow(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<FunctionButton> getFunctionButtons() {
		return functionButtons;
	}
	public void setFunctionButtons(ArrayList<FunctionButton> functionButtons) {
		this.functionButtons = functionButtons;
	}
	
	public void addFunctionButton(FunctionButton button) {
		functionButtons.add(button);
	}
	
	public void display() {
		System.out.println("��ʾ���ڣ�" + this.title);
		System.out.println("��ʾ���ܼ���");
		for(Object object : functionButtons) {
			System.out.println(((FunctionButton)object).getName());
		}
		System.out.println("------------------------------------");
	}
}
