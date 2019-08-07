package behavioral.strategy;

public class Client {
	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket();
		double originalPrice = 60.0;
		double currentPrice;
		
		ticket.setPrice(originalPrice);
		System.out.println("ԭʼƱ��Ϊ��" + originalPrice);
		System.out.println("------------------------------");
		
		Discount discount;
		discount =(Discount)XMLUtil.getBean();
		ticket.setDiscount(discount);
		
		currentPrice = ticket.getPrice();
		System.out.println("�ۺ��Ϊ��" + currentPrice);
	}
}
