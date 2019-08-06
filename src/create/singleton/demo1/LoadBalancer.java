package create.singleton.demo1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sun.java_cup.internal.runtime.Scanner;

//���ؾ�����
public class LoadBalancer {
	//˽�о�̬��Ա�������洢Ψһʵ��
	private static LoadBalancer instance = null;
	//����������
	private List<String> server_list = null;
	
	//˽�й��캯��
	private LoadBalancer() {
		server_list = new ArrayList<String>();
	}
	
	//���о�̬��Ա����������Ψһʵ��
	public static LoadBalancer getInstancer() {
		//˫�ؼ������double check locking
		if(null == instance) {
			synchronized (LoadBalancer.class) {
				if(null == instance) {
					instance= new LoadBalancer();
				}
			}
		}
		return instance;
	}
	
	//���ӷ�����
	public void addServer(String server) {
		server_list.add(server);
	}
	
	//ɾ��������
	public void removeServer(String server) {
		server_list.remove(server);
		java.util.Scanner sc = new java.util.Scanner(System.in);
	}
	
	// ��ȡRandom �������ȡ������
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(server_list.size());
		return (String)server_list.get(i);
	}
}
