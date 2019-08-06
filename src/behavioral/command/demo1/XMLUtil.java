package behavioral.command.demo1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean(int i) {
		if(i<0 || i>1) {
			return null;
		}
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse( new File("src/behavioral/command/config.xml"));
			NodeList nodeList = document.getElementsByTagName("className");
			Node classNode = nodeList.item(i).getFirstChild();
			String className = classNode.getNodeValue().trim();
			Class _class = Class.forName(className);
			Object object = _class.newInstance();
			return object;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
