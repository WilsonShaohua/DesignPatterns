package behavioral.strategy;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("src/behavioral/strategy/config.xml"));
			NodeList nodeList = document.getElementsByTagName("className");
			Node node = nodeList.item(0).getFirstChild();
			String className = node.getNodeValue().trim();
			Class _class = Class.forName(className);
			Object object = _class.newInstance();
			return object;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
