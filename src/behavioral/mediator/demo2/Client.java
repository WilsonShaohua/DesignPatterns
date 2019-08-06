package behavioral.mediator.demo2;

import behavioral.mediator.demo1.Button;
import behavioral.mediator.demo1.ComboBox;
import behavioral.mediator.demo1.List;
import behavioral.mediator.demo1.TextBox;

public class Client {
	public static void main(String args[]) {
        //�����������н��߶����н��߶���
		SubConcreteMediator mediator;
		mediator = new SubConcreteMediator();
		
		Button addBT = new Button();
		List list = new List();
	    ComboBox cb = new ComboBox();
	    TextBox userNameTB = new TextBox();
	    Label label = new Label();
 
		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);
		label.setMediator(mediator);
		
		mediator.addButton = addBT;
		mediator.list = list;
		mediator.comboBox = cb;
		mediator.userNameTextBox = userNameTB;
		mediator.label = label;
			
		addBT.changed();
		System.out.println("-----------------------------");
		list.changed();
	}

}
