package structure.flyweight.igo_chessman;

public abstract class IgoChessman {

	public abstract String getColor();

	public void display() {
		System.out.println("Æå×ÓÑÕÉ«£º"  + this.getColor());
	}

}
