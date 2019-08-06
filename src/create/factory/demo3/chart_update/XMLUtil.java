package create.factory.demo3.chart_update;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static String getChartType() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document document;
			document = builder.parse(new File("src/create/factory/demo3/chart_update/config.xml"));	
			
			//��ȡ����ͼ�����͵��ı��ڵ�
			NodeList n1 = document.getElementsByTagName("chartType");
			Node classNode = n1.item(0).getFirstChild();
			String chartType = classNode.getNodeValue().trim();
			return chartType;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
