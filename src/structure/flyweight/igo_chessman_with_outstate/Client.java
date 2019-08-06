package structure.flyweight.igo_chessman_with_outstate;


public class Client {

	public static void main(String[] args) {
		IgoChessman black1, black2, black3, white1, white2;
		IgoChessmanFactory factory;

		// 获取享元工厂对象
		factory = IgoChessmanFactory.getInstance();

		// 通过享元工厂获取三颗黑子
		black1 =  factory.getIgoChessman("black");
		black2 =  factory.getIgoChessman("black");
		black3 = factory.getIgoChessman("black");
		System.out.println("判断两颗黑子是否相同：" + (black1 == black2));

		// 通过享元工厂获取两颗白子
		white1 = factory.getIgoChessman("white");
		white2 = factory.getIgoChessman("white");
		System.out.println("判断两颗白子是否相同：" + (white1 == white2));
		
		
		black1.display(new Coordinates(1, 2));
		black1.display(new Coordinates(1, 2));
		black1.display(new Coordinates(1, 2));
		black1.display(new Coordinates(1, 2));
		
	}

}
