package behavioral.memento.demo1;

public class Client {
	public static void main(String args[]) {
		MementoCaretaker mc = new MementoCaretaker();
		Chessman chess = new Chessman("��", 1, 1);
		display(chess);
		mc.setMemento(chess.save()); // ����״̬
		chess.setY(4);
		display(chess);
		mc.setMemento(chess.save()); // ����״̬
		display(chess);
		chess.setX(5);
		display(chess);
		System.out.println("******����******");
		chess.restore(mc.getMemento()); // �ָ�״̬
		display(chess);
	}

	public static void display(Chessman chess) {
		System.out.println("����" + chess.getLabel() + "��ǰλ��Ϊ��" + "��" + chess.getX() + "��" + "��" + chess.getY() + "�С�");
	}
}
