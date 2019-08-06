package behavioral.mediator.demo2;

import behavioral.mediator.demo1.Component;
import behavioral.mediator.demo1.ConcreteMediator;

public class SubConcreteMediator extends ConcreteMediator {
	public Label label;

	@Override
	public void componentChanged(Component componnet) {
		if(componnet == addButton) {
			System.out.println("--单击增加按钮--");
			list.update();
			comboBox.update();
			userNameTextBox.update();
			label.update(); //文本标签更新
		}
        //从列表框选择客户
		else if(componnet == list) {
			System.out.println("--从列表框选择客户--");
			comboBox.select();
			userNameTextBox.setText();
		}
        //从组合框选择客户
		else if(componnet == comboBox) {
			System.out.println("--从组合框选择客户--");
			comboBox.select();
			userNameTextBox.setText();
		}
	}
	
	
}
