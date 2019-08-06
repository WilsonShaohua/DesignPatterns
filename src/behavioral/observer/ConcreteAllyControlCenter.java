package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAllyControlCenter extends AllyControlCenter {
	public ConcreteAllyControlCenter(String allyName) {
		this.allyName = allyName;
		System.out.println(this.allyName + "战队组建成功！");
		System.out.println("-----------------------------------");
	}

	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
		for (Object object : players) {
			if (!name.equalsIgnoreCase(((Observer) object).getName()))
				((Observer) object).help();
		}
	}

}
