package behavioral.mediator.demo1;

public class ConcreteMediator extends Mediator {
	public Button addButton;
	public List list;
	public TextBox userNameTextBox;
	public ComboBox comboBox;

	@Override
	public void componentChanged(Component componnet) {
		if(componnet == addButton) {
			System.out.println("--单击增加按钮--");
			list.update();
			comboBox.update();
			userNameTextBox.update();
		}else if(componnet == list) {
			System.out.println("--从列表框选择客户--");
			comboBox.select();
			userNameTextBox.setText();
		}else if(componnet == comboBox) {
			System.out.println("--从组合框选择客户--");
			comboBox.select();
			userNameTextBox.setText();
		}
	}

}
