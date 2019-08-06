package structure.flyweight.igo_chessman_with_outstate;


public class Client {

	public static void main(String[] args) {
		IgoChessman black1, black2, black3, white1, white2;
		IgoChessmanFactory factory;

		// ��ȡ��Ԫ��������
		factory = IgoChessmanFactory.getInstance();

		// ͨ����Ԫ������ȡ���ź���
		black1 =  factory.getIgoChessman("black");
		black2 =  factory.getIgoChessman("black");
		black3 = factory.getIgoChessman("black");
		System.out.println("�ж����ź����Ƿ���ͬ��" + (black1 == black2));

		// ͨ����Ԫ������ȡ���Ű���
		white1 = factory.getIgoChessman("white");
		white2 = factory.getIgoChessman("white");
		System.out.println("�ж����Ű����Ƿ���ͬ��" + (white1 == white2));
		
		
		black1.display(new Coordinates(1, 2));
		black1.display(new Coordinates(1, 2));
		black1.display(new Coordinates(1, 2));
		black1.display(new Coordinates(1, 2));
		
	}

}
