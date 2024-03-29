package behavioral.command.demo2;

public class ConcreteCommand extends AbstractCommand {
	private Adder adder = new Adder();
	private int value;
	@Override
	public int execute(int value) {
		this.value = value;
		return adder.add(value);
	}

	@Override
	public int undo() {
		return adder.add(-value);
	}

}
