package behavioral.interpreter.demo1;

import java.util.Hashtable;
import java.util.Map.Entry;

public class DirectionNode extends AbstractNode {
	private Hashtable<String, String> table;
	private String direction;

	public DirectionNode(String direction) {
		this.direction = direction;
		// 可以通过xml文件读取配置信息，从而不必修改源码实现系统的扩展
		table = new Hashtable<String, String>(4);
		table.put("up", "向上");
		table.put("down", "向下");
		table.put("left", "向左");
		table.put("right", "向右");
	}

	@Override
	public String interpret() {
		String resoult = table.get(direction);
		if (null == resoult) {
			resoult = "无效指令";
		}
		return resoult;
	}

}
