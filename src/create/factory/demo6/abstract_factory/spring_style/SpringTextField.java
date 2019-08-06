package create.factory.demo6.abstract_factory.spring_style;

import create.factory.demo6.abstract_factory._interface.TextField;

public class SpringTextField implements TextField {
	@Override
	public void display() {
		System.out.println("显示浅绿色边框文本框");
	}

}
