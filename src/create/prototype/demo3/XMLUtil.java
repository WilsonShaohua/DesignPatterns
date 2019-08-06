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
	//从资源文件 config中获取
	public static List getBean() {		
		try {
			// 创建文档对象
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document;
			document = builder.parse( new File("src/create/prototype/demo3/config.xml"));
			
			// 获取文本内容
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
	
	//从资源文件 source中获取当前文件的种类、关键字、类（包名、类名）
	public static Map getSource() {
		try {
			//创建文档对象
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse( new File("src/create/prototype/demo3/source.xml"));
			//获取文件资源，并添加进入结果集
			NodeList nodeListKey = document.getElementsByTagName("Key");
			NodeList nodeListClassName = document.getElementsByTagName("ClassName");
			/**
			 * 结果集
			 */
			Map<String,OfficialDocument> map = new HashMap(); 
			//遍历并添加每一种文档
			for(int i=0;i<nodeListKey.getLength();i++) {
				//获取当前节点信息
				Node keyNode = nodeListKey.item(i).getFirstChild(); 
				Node classNameNode = nodeListClassName.item(i).getFirstChild();
				//当前节点key
				String key = keyNode.getNodeValue().trim();
				//当前类名
				String className = classNameNode.getNodeValue().trim();
				//获取当前类的实例化对象
				Class _class = Class.forName(className); //获取当前文档类型
				Object object = _class.newInstance();
				//添加进入结果集
				map.put(key, (OfficialDocument)object);
			}
			return map;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
