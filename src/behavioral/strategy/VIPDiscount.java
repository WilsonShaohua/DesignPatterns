package behavioral.strategy;

public class VIPDiscount implements Discount {

	@Override
	public double calculate(double price) {
		System.out.println("VIPƱ");
		System.out.println("���ӻ��֣�");
		return price * 0.5;
	}

}
