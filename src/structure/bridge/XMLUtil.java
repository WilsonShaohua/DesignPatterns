package structure.bridge;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static Object getBean(String args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("src/structure/bridge/config.xml"));
			NodeList nodeList = null;
			Node classNode = null;

			nodeList = document.getElementsByTagName("className");
			if ("image".equals(args)) {
				classNode = nodeList.item(0).getFirstChild();
			} else if ("os".equals(args)) {
				classNode = nodeList.item(1).getFirstChild();
			}
			String className = classNode.getNodeValue().trim();
			Class _class = Class.forName(className);
			Object object = _class.newInstance();
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
