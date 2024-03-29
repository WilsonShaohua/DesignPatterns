package behavioral.chain;

public class President extends Approver {

	public President(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount() < 500000) {
			System.out.println("董事长" + this.name + "审批采购单：" + request.getAmount() + "元，采购目的" + request.getPurpose()  + "。");
		}else {
			successor.processRequest(request);
		}	}

}
