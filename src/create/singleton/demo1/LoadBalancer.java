package create.singleton.demo1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sun.java_cup.internal.runtime.Scanner;

//负载均衡器
public class LoadBalancer {
	//私有静态成员变量，存储唯一实例
	private static LoadBalancer instance = null;
	//服务器集合
	private List<String> server_list = null;
	
	//私有构造函数
	private LoadBalancer() {
		server_list = new ArrayList<String>();
	}
	
	//公有静态成员方法，返回唯一实例
	public static LoadBalancer getInstancer() {
		//双重检查锁定double check locking
		if(null == instance) {
			synchronized (LoadBalancer.class) {
				if(null == instance) {
					instance= new LoadBalancer();
				}
			}
		}
		return instance;
	}
	
	//增加服务器
	public void addServer(String server) {
		server_list.add(server);
	}
	
	//删除服务器
	public void removeServer(String server) {
		server_list.remove(server);
		java.util.Scanner sc = new java.util.Scanner(System.in);
	}
	
	// 获取Random 类随机获取服务器
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(server_list.size());
		return (String)server_list.get(i);
	}
}
