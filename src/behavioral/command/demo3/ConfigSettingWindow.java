package behavioral.command.demo3;

import java.util.ArrayList;

public class ConfigSettingWindow {
	private ArrayList<Command> commands = new ArrayList<Command>();
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void call(String args) {
		command.execute(args);
		commands.add(command);		
	}
	
	public void save() {
		FileUtile.writeCommands(commands);
	}

	public void recover() {
		ArrayList list;
		list = FileUtile.readCommands();
		for(Object object : list) {
			((Command)object).execute();
		}
	}
}
