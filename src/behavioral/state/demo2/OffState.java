package behavioral.state.demo2;

public class OffState extends State {

	@Override
	public void on(Switch s) {
		System.out.println("�򿪣�");
		s.setState(Switch.getState("on"));
	}

	@Override
	public void off(Switch s) {
		System.out.println("�Ѿ��رգ�");
	}

}
