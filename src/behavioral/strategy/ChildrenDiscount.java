package behavioral.strategy;

public class ChildrenDiscount implements Discount {
	@Override
	public double calculate(double price) {
		System.out.println("��ͯƱ��");
		return price >= 20 ? (price - 10) : price;
	}
}
