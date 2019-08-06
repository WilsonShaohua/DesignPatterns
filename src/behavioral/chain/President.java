package behavioral.chain;

public class President extends Approver {

	public President(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount() < 500000) {
			System.out.println("���³�" + this.name + "�����ɹ�����" + request.getAmount() + "Ԫ���ɹ�Ŀ��" + request.getPurpose()  + "��");
		}else {
			successor.processRequest(request);
		}	}

}
