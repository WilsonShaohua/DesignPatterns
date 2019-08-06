package behavioral.command.demo1;

public class FunctionButton {
	private String name;
	private Command commond;
	public FunctionButton(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCommond(Command commond) {
		this.commond = commond;
	}
	public void onClick() {
		System.out.print("µã»÷¹¦ÄÜ¼ü£º");
		commond.execute();
	}
}
