package behavioral.mediator.demo1;

public class Client {
	public static void main(String args[]) {
		// �����н��߶���
		ConcreteMediator mediator;
		mediator = new ConcreteMediator();

		// ����ͬ�¶���
		Button addBT = new Button();
		List list = new List();
		ComboBox comboBox = new ComboBox();
		TextBox userNameTB = new TextBox();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		comboBox.setMediator(mediator);
		userNameTB.setMediator(mediator);

		mediator.addButton = addBT;
		mediator.list = list;
		mediator.comboBox = comboBox;
		mediator.userNameTextBox = userNameTB;

		addBT.changed();
		System.out.println("-----------------------------");
		list.changed();
	}
}
