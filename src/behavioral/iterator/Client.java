package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		List products = new ArrayList();
		products.add("���콣");
		products.add("������");
		products.add("�ϳ���");
		products.add("��������");
		products.add("��ʮ���¾�");

		AbstractObjectList list;
		AbstractIterator iterator;

		list = new ProductList(products); // �����ۺ϶���
		iterator = list.createIterator(); // ��������������

		System.out.println("���������");
		while (!iterator.isLast()) {
			System.out.print(iterator.getNextItem() + "��");
			iterator.next();
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("���������");
		while (!iterator.isFirst()) {
			System.out.print(iterator.getPreviousItem() + "��");
			iterator.previous();
		}
	}

}