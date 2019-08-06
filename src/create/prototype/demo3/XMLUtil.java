package create.prototype.demo3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	//����Դ�ļ� config�л�ȡ
	public static List getBean() {		
		try {
			// �����ĵ�����
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document;
			document = builder.parse( new File("src/create/prototype/demo3/config.xml"));
			
			// ��ȡ�ı�����
			List<String> list = new ArrayList<String>();
			NodeList nodeList = document.getElementsByTagName("Document");
			for(int i=0;i<nodeList.getLength();i++) {
				Node node = nodeList.item(i).getFirstChild();				
				list.add(node.getNodeValue());
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//����Դ�ļ� source�л�ȡ��ǰ�ļ������ࡢ�ؼ��֡��ࣨ������������
	public static Map getSource() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse( new File("src/create/prototype/demo3/source.xml"));
			//��ȡ�ļ���Դ������ӽ�������
			NodeList nodeListKey = document.getElementsByTagName("Key");
			NodeList nodeListClassName = document.getElementsByTagName("ClassName");
			/**
			 * �����
			 */
			Map<String,OfficialDocument> map = new HashMap(); 
			//���������ÿһ���ĵ�
			for(int i=0;i<nodeListKey.getLength();i++) {
				//��ȡ��ǰ�ڵ���Ϣ
				Node keyNode = nodeListKey.item(i).getFirstChild(); 
				Node classNameNode = nodeListClassName.item(i).getFirstChild();
				//��ǰ�ڵ�key
				String key = keyNode.getNodeValue().trim();
				//��ǰ����
				String className = classNameNode.getNodeValue().trim();
				//��ȡ��ǰ���ʵ��������
				Class _class = Class.forName(className); //��ȡ��ǰ�ĵ�����
				Object object = _class.newInstance();
				//��ӽ�������
				map.put(key, (OfficialDocument)object);
			}
			return map;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
