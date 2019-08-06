package create.factory.demo6.abstract_factory.spring_style;

import create.factory.demo6.abstract_factory._interface.ComboBox;

public class SpringComboBox implements ComboBox {

	@Override
	public void display() {
		System.out.println("显示绿色组合框");
	}

}
