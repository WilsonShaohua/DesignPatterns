package behavioral.strategy;

public class StudentDiscount implements Discount {

	@Override
	public double calculate(double price) {
		System.out.println("ѧ��Ʊ");
		return price *0.8 ;
	}

}
