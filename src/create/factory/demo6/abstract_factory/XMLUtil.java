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
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document document;
			document = builder.parse( new File("src/create/factory/demo6/abstract_factory/config.xml"));
			
			//获取包含类名的文本节点
			NodeList nl = document.getElementsByTagName("className");
			Node node = nl.item(0).getFirstChild();
			String class_name = node.getNodeValue().trim();
			
			//通过类名生成实例对象并将其返回
			Class _class = Class.forName(class_name);
			Object object = _class.newInstance();
			return object;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
