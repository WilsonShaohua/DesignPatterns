package create.factory.demo6.abstract_factory;

import create.factory.demo6.abstract_factory._interface.Button;
import create.factory.demo6.abstract_factory._interface.ComboBox;
import create.factory.demo6.abstract_factory._interface.SkinFactory;
import create.factory.demo6.abstract_factory._interface.TextField;

public class Client {
	public static void main(String[] args) {
		SkinFactory factory;
		Button button;
		TextField text_field;
		ComboBox combo_box;
		factory = (SkinFactory) XMLUtil.getBean();
		button = factory.createButton();
		text_field = factory.createTextField();
		combo_box = factory.createComboBox();
		
		button.display();
		text_field.display();
		combo_box.display();
	}
}
