package create.factory.demo6.abstract_factory.summer_style;

import create.factory.demo6.abstract_factory._interface.TextField;

public class SummerTextField implements TextField {

	@Override
	public void display() {
		System.out.println("显示蓝色边框文本");
	}

}
