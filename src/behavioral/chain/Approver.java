package behavioral.chain;

public abstract class Approver {
	protected Approver successor; //后继对象
	protected String name;  //审批者姓名
	public Approver(String name) {
		super();
		this.name = name;
	}

	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	public abstract void processRequest(PurchaseRequest request);
}
