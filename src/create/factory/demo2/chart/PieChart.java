package create.factory.demo2.chart;

public class PieChart implements Chart {

	public PieChart() {
		System.out.println("����һ����״ͼ");
	}
	
	@Override
	public void display() {
		System.out.println("��ʾ��״ͼ");
	}

}
