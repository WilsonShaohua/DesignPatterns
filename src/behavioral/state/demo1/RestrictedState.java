package behavioral.state.demo1;

public class RestrictedState extends AccountState {
	public RestrictedState(Account account) {
		this.account = account;
	}

	public RestrictedState(AccountState state) {
		this.account  =state.account;
	}

	@Override
	public void deposit(double amount) {
		this.account.setBalance(this.account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("�˺����ޣ�ȡ��ʧ�ܣ�");
	}

	@Override
	public void computeInterest() {
		System.out.println("������Ϣ��");
	}

	@Override
	public void stateCheck() {
		if(account.getBalance() > 0) {
			account.setState(new NormalState(this));
		}else if(account.getBalance()> -2000) {
			account.setState(new OverdraftState(this));
		}
	}

}
