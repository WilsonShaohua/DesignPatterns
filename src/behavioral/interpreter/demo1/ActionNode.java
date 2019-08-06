package behavioral.interpreter.demo1;

import java.util.Hashtable;

public class ActionNode extends AbstractNode {
	private String action;
	private Hashtable<String, String> table;

	public ActionNode(String action) {
		super();
		if (action == null) {
			action = "null";
		}
		this.action = action;

		table = new Hashtable();
		table.put("move", "移动");
		table.put("run", "快速移动");
		table.put("null", "无效指令");
	}

	@Override
	public String interpret() {
		String resoult = table.get(action);
		if (null == resoult) {
			resoult = "无效指令";
		}
		return resoult;
	}

}
