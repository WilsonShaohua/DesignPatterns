package structure.flyweight.igo_chessman_with_outstate;

public abstract class IgoChessman {
	public abstract String getColor();
	public void display(Coordinates coordinates) {
		System.out.println("������ɫ��" + this.getColor() + "������λ�ã�" +  coordinates.getX() + "," + coordinates.getY());
	}
}
