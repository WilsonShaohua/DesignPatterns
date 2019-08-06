package create.factory.demo6.abstract_factory;

import create.factory.demo6.abstract_factory._interface.Button;
import create.factory.demo6.abstract_factory._interface.ComboBox;
import create.factory.demo6.abstract_factory._interface.SkinFactory;
import create.factory.demo6.abstract_factory._interface.TextField;
import create.factory.demo6.abstract_factory.summer_style.SummerButton;
import create.factory.demo6.abstract_factory.summer_style.SummerComboBox;
import create.factory.demo6.abstract_factory.summer_style.SummerTextField;

public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SummerComboBox();
	}

}
