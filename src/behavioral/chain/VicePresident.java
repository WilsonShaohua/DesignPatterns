package behavioral.chain;

public class VicePresident extends Approver {

	public VicePresident(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount() < 100000) {
			System.out.println("�����³�" + this.name + "�����ɹ�����" + request.getAmount() + "Ԫ���ɹ�Ŀ��" + request.getPurpose()  + "��");
		}else {
			successor.processRequest(request);
		}	}

}
