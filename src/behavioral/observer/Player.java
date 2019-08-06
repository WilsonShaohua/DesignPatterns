package behavioral.observer;

public class Player implements Observer {
	private String name;
	
	
	public Player(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void help() {
		System.out.println("���ס��" + this.name + "�����㣡");
	}

	@Override
	public void beAttacked(AllyControlCenter allyControlCenter) {
		System.out.println(this.name + "��������");
		allyControlCenter.notifyObserver(this.name);
		
	}

}
