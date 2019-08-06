package behavioral.command.demo3;

import java.io.Serializable;

abstract public class Command implements Serializable {
	protected String name;
	protected String args;
	protected ConfigOperator configOperator;
	public Command(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setConfigOperator(ConfigOperator configOperator) {
		this.configOperator = configOperator;
	}
	
	
	public abstract void execute(String args);
	public abstract void execute();
	
}
