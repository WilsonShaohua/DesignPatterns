package create.factory.demo6.abstract_factory;

import create.factory.demo6.abstract_factory._interface.Button;
import create.factory.demo6.abstract_factory._interface.ComboBox;
import create.factory.demo6.abstract_factory._interface.SkinFactory;
import create.factory.demo6.abstract_factory._interface.TextField;
import create.factory.demo6.abstract_factory.spring_style.SpringButton;
import create.factory.demo6.abstract_factory.spring_style.SpringComboBox;
import create.factory.demo6.abstract_factory.spring_style.SpringTextField;

public class SpringSkinFactory implements SkinFactory {
	@Override
	public Button createButton() {		
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SpringComboBox();
	}

}
