package behavioral.strategy;

public class ChildrenDiscount implements Discount {
	@Override
	public double calculate(double price) {
		System.out.println("¶ùÍ¯Æ±£º");
		return price >= 20 ? (price - 10) : price;
	}
}
