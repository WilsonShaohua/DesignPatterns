package structure.flyweight.igo_chessman;

public class Client {

	public static void main(String[] args) {
		IgoChessman black1, black2, black3, white1, white2;
		IgoChessmanFactory factory;

		// ��ȡ��Ԫ��������
		factory = IgoChessmanFactory.getInstance();

		// ͨ����Ԫ������ȡ���ź���
		black1 = (BlackIgoChessman) factory.getIgoChessman("black");
		black2 = (BlackIgoChessman) factory.getIgoChessman("black");
		black3 = (BlackIgoChessman) factory.getIgoChessman("black");
		System.out.println("�ж����ź����Ƿ���ͬ��" + (black1 == black2));

		// ͨ����Ԫ������ȡ���Ű���
		white1 = factory.getIgoChessman("white");
		white2 = factory.getIgoChessman("white");
		System.out.println("�ж����Ű����Ƿ���ͬ��" + (white1 == white2));

		// ��ʾ����
		black1.display();
		black2.display();
		black3.display();
		white1.display();
		white2.display();
	}

}
