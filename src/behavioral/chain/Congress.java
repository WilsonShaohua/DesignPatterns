package behavioral.chain;

public class Congress extends Approver {

	public Congress(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest request) {
			System.out.println("�ٿ����»������ɹ�����" + request.getAmount() + "Ԫ���ɹ�Ŀ��" + request.getPurpose()  + "��");
	}	

}
