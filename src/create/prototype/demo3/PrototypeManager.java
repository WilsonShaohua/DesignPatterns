/**
 * ����ģʽ��������������
 * ԭ��ģʽ�����µ��ļ�
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
		return ((OfficialDocument) hashTable.get(key)).clone();//ǳ��¡
	}
	
	public static PrototypeManager getPrototypeManager() {
		return prototypeManager;
	}
}
