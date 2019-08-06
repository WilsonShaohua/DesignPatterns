package create.factory.demo5.logger_xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class XMLUtil {
	public static Object getBean() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbFactory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File("src/create/factory/demo5/logger_xml/config.xml"));
			//��ȡ�����������ı��ڵ�0
			NodeList nl = document.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String className = classNode.getNodeValue();	
			
			//ͨ����������ʵ������
			Class _class = Class.forName(className);			
			Object object = _class.newInstance();
			return object;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
