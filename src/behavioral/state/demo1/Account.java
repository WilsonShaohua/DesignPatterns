package behavioral.state.demo1;

public class Account {
	private AccountState state;
	private String owner;
	private double balance = 0;
	public Account(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.state = new NormalState(this);
		System.out.println(this.owner + "��������ʼ���Ϊ��"+ balance);
		System.out.println("------------------------------------------------");
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setState(AccountState state) {
		this.state = state;
	}
	
	public void deposit(double amount) {
		System.out.println(this.owner + "���" + amount);
		state.deposit(amount);
		System.out.println("�����Ϊ��" + this.balance);
		System.out.println("���˻�״̬Ϊ��" + this.state.getClass().getName());
		System.out.println("---------------------------------------------------");
	}
	
	
	public void withdraw(double amount) {
		System.out.println(this.owner + "ȡ��" + amount);
		state.withdraw(amount);
		System.out.println("�����Ϊ��" + this.balance);
		System.out.println("���˻�״̬Ϊ��" + this.state.getClass().getName());
		System.out.println("---------------------------------------------------");
	}
	
	public void computeInterest() {
		state.computeInterest();
	}
}
