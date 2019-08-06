package behavioral.command.demo1;

public class MinimizeCommand extends Command {
	private WindowHanlder windowHanlder;
	public MinimizeCommand() {
		windowHanlder = new WindowHanlder();
	}
	@Override
	public void execute() {
		windowHanlder.minimize();
	}

}
