package create.factory.demo6.abstract_factory;

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
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document document;
			document = builder.parse( new File("src/create/factory/demo6/abstract_factory/config.xml"));
			
			//��ȡ�����������ı��ڵ�
			NodeList nl = document.getElementsByTagName("className");
			Node node = nl.item(0).getFirstChild();
			String class_name = node.getNodeValue().trim();
			
			//ͨ����������ʵ�����󲢽��䷵��
			Class _class = Class.forName(class_name);
			Object object = _class.newInstance();
			return object;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
