package behavioral.command.demo1;

public class HelpCommand extends Command {
	private HelpCommander helpCommander;
	public HelpCommand() {
		helpCommander = new HelpCommander();
	}
	
	@Override
	public void execute() {
		helpCommander.display();
	}

}
