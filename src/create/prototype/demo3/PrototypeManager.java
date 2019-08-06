/**
 * 饿汉模式产生管理器单例
 * 原型模式产生新的文件
 */

package create.prototype.demo3;

import java.util.Hashtable;
import java.util.Map;

public class PrototypeManager {
	private Hashtable hashTable = new Hashtable();
	private static PrototypeManager prototypeManager = new PrototypeManager();
	
	private PrototypeManager() {
		Map<String,OfficialDocument> map = XMLUtil.getSource();		
		for(String key : map.keySet()) {
			OfficialDocument value = map.get(key);
			hashTable.put(key, value);
		}
	}
	
	public void addOfficialDocument(String key,OfficialDocument document) {
		hashTable.put(key,document);
	}
	
	public OfficialDocument getOfficialDocument(String key) {
		return ((OfficialDocument) hashTable.get(key)).clone();//浅克隆
	}
	
	public static PrototypeManager getPrototypeManager() {
		return prototypeManager;
	}
}
