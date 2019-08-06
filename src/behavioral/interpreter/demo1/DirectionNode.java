package behavioral.interpreter.demo1;

import java.util.Hashtable;
import java.util.Map.Entry;

public class DirectionNode extends AbstractNode {
	private Hashtable<String, String> table;
	private String direction;

	public DirectionNode(String direction) {
		this.direction = direction;
		// ����ͨ��xml�ļ���ȡ������Ϣ���Ӷ������޸�Դ��ʵ��ϵͳ����չ
		table = new Hashtable<String, String>(4);
		table.put("up", "����");
		table.put("down", "����");
		table.put("left", "����");
		table.put("right", "����");
	}

	@Override
	public String interpret() {
		String resoult = table.get(direction);
		if (null == resoult) {
			resoult = "��Чָ��";
		}
		return resoult;
	}

}
