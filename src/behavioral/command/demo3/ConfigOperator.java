package behavioral.command.demo3;

import java.io.Serializable;

public class ConfigOperator implements Serializable {
	public void insert(String args) {
		System.out.println("�����½ڵ㣺" + args);
	}
	
	public void modify(String args) {
		System.out.println("�޸Ľڵ㣺" + args);
	}
	
	public void delete(String args) {
		System.out.println("ɾ���ڵ㣺" + args);
	}
}
