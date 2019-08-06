package behavioral.interpreter.demo1;

public class DistanceNode extends AbstractNode {
	private String distance;
	
	public DistanceNode(String distance) {
		super();
		this.distance = distance;
	}

	@Override
	public String interpret() {
		return this.distance;
	}

}
