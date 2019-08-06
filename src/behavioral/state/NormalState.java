package behavioral.state;

public class NormalState extends AccountState {
	
	public NormalState(Account account) {
		super();
		this.account = account;
	}
	
	public NormalState(AccountState state) {
		super();
		this.account = state.account;
	}
	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
		stateCheck();
	}

	@Override
	public void computeInterest() {
		System.out.println("����״̬����֧����Ϣ��");
	}

	@Override
	public void stateCheck() {
		if(account.getBalance() > -2000 && account.getBalance() <= 0) {
			account.setState(new OverdraftState(this));
		}else if(account.getBalance() == -2000) {
			account.setState(new RestrictedState(this));
		}else if(account.getBalance() < -2000) {
			System.out.println("�������ޣ�");
		}
	}

}
