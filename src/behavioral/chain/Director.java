package behavioral.chain;

public class Director extends Approver {
	public Director(String name) {
		super(name);
	}
	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount() < 50000) {
			System.out.println("����" + this.name + "�����ɹ�����" + request.getAmount() + "Ԫ���ɹ�Ŀ��" + request.getPurpose()  + "��");
		}else {
			successor.processRequest(request);
		}
	}

}
