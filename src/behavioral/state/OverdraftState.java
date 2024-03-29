package behavioral.state;

public class OverdraftState extends AccountState {
	public OverdraftState(Account account) {
		this.account = account;
	}
	
	public OverdraftState(AccountState state) {
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
		System.out.println("利息计算！");
	}

	@Override
	public void stateCheck() {
		if(account.getBalance()>0) {
			account.setState(new NormalState(this));
		}else if(account.getBalance() == -2000) {
			account.setState( new RestrictedState(this));
		}else if(account.getBalance()<-2000) {
			System.out.println("操作受限！");
		}
	}

}
