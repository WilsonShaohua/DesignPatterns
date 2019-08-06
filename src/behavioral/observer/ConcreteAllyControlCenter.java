package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAllyControlCenter extends AllyControlCenter {
	public ConcreteAllyControlCenter(String allyName) {
		this.allyName = allyName;
		System.out.println(this.allyName + "ս���齨�ɹ���");
		System.out.println("-----------------------------------");
	}

	@Override
	public void notifyObserver(String name) {
		System.out.println(this.allyName + "ս�ӽ���֪ͨ������" + name + "���ܵ��˹�����");
		for (Object object : players) {
			if (!name.equalsIgnoreCase(((Observer) object).getName()))
				((Observer) object).help();
		}
	}

}
