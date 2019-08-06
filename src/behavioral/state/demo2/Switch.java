package behavioral.state.demo2;

public class Switch {
	private static State state,onState,offState;
	private String name;
	public Switch(String name) {
		this.name = name;
		onState = new OnState();
		offState = new OffState();
		this.state = this.onState;
	}
	public static State getState(String type) {
		if("on".equals(type)) {
			return onState;
		}else if("off".equals(type)){
			return offState;
		}
		return null;
	}
	public void setState(State  state) {
		this.state = state;
	}
	public void on() {
		System.out.print(name);
		state.on(this);
	}
	
	public void off() {
		System.out.print(name);
		state.off(this);
	}
}
