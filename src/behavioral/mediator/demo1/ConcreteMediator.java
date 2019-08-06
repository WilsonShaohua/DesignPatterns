package behavioral.mediator.demo1;

public class ConcreteMediator extends Mediator {
	public Button addButton;
	public List list;
	public TextBox userNameTextBox;
	public ComboBox comboBox;

	@Override
	public void componentChanged(Component componnet) {
		if(componnet == addButton) {
			System.out.println("--�������Ӱ�ť--");
			list.update();
			comboBox.update();
			userNameTextBox.update();
		}else if(componnet == list) {
			System.out.println("--���б��ѡ��ͻ�--");
			comboBox.select();
			userNameTextBox.setText();
		}else if(componnet == comboBox) {
			System.out.println("--����Ͽ�ѡ��ͻ�--");
			comboBox.select();
			userNameTextBox.setText();
		}
	}

}
