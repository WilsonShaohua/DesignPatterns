package create.prototype.demo3;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		PrototypeManager manager = PrototypeManager.getPrototypeManager();
		List<String> types = XMLUtil.getBean();
		OfficialDocument doc;
		for (int i = 0; i < types.size(); i++) {
			doc = manager.getOfficialDocument(types.get(i));
			doc.display();
		}
	}
}
