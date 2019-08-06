package behavioral.mediator.demo2;

import behavioral.mediator.demo1.Component;
import behavioral.mediator.demo1.ConcreteMediator;

public class SubConcreteMediator extends ConcreteMediator {
	public Label label;

	@Override
	public void componentChanged(Component componnet) {
		if(componnet == addButton) {
			System.out.println("--�������Ӱ�ť--");
			list.update();
			comboBox.update();
			userNameTextBox.update();
			label.update(); //�ı���ǩ����
		}
        //���б��ѡ��ͻ�
		else if(componnet == list) {
			System.out.println("--���б��ѡ��ͻ�--");
			comboBox.select();
			userNameTextBox.setText();
		}
        //����Ͽ�ѡ��ͻ�
		else if(componnet == comboBox) {
			System.out.println("--����Ͽ�ѡ��ͻ�--");
			comboBox.select();
			userNameTextBox.setText();
		}
	}
	
	
}
