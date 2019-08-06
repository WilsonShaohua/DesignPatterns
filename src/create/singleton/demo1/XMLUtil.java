package create.singleton.demo1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static LoadBalancer getBean() {
		LoadBalancer balancer = null;
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File("src/create/singleton/demo1/config.xml"));

			// 获取包名和文本节点
			NodeList nodeList = document.getElementsByTagName("Server");
			balancer = LoadBalancer.getInstancer();
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node serverNode = nodeList.item(i).getFirstChild();
				String server = serverNode.getNodeValue();
				balancer.addServer(server);
			}
			return balancer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
