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
		table.put("move", "�ƶ�");
		table.put("run", "�����ƶ�");
		table.put("null", "��Чָ��");
	}

	@Override
	public String interpret() {
		String resoult = table.get(action);
		if (null == resoult) {
			resoult = "��Чָ��";
		}
		return resoult;
	}

}
