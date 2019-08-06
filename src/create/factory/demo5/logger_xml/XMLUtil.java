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
			//创建文档对象
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbFactory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File("src/create/factory/demo5/logger_xml/config.xml"));
			//获取包含类名的文本节点0
			NodeList nl = document.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String className = classNode.getNodeValue();	
			
			//通过类名生成实力对象并
			Class _class = Class.forName(className);			
			Object object = _class.newInstance();
			return object;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
