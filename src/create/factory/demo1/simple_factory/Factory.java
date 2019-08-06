package create.factory.demo1.simple_factory;

public class Factory {
	public static Product getProduct(String arg) {
		Product product=null;
		
		if(arg.equalsIgnoreCase("A")){
			product = new ConcreateProductA();
		}else if(arg.equalsIgnoreCase("B")) {
			product = new ConcreateProductB();
		}		
		return product;
	}
}
