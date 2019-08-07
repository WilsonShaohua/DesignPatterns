package behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		
		ticket.setPrice(originalPrice);
		System.out.println("原始票价为：" + originalPrice);
		System.out.println("------------------------------");
		
		Discount discount;
		discount =(Discount)XMLUtil.getBean();
		ticket.setDiscount(discount);
		
		currentPrice = ticket.getPrice();
		System.out.println("折后价为：" + currentPrice);
	}
}
