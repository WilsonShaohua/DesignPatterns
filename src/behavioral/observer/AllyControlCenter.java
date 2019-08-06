package behavioral.observer;

import java.util.ArrayList;

public abstract class AllyControlCenter {
	protected String allyName;
	protected ArrayList<Observer> players = new ArrayList<Observer>();
	public String getAllyName() {
		return allyName;
	}
	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	
	public void join(Observer observer) {
		System.out.println(observer.getName() + "����" + this.allyName + "ս�ӣ�");
		players.add(observer);
	}
	
	public void quit(Observer observer) {
		System.out.println(observer.getName() + "�˳�" + this.allyName + "ս�ӣ�");
		players.remove(observer);
	}
	
	public abstract void notifyObserver(String name);
}
