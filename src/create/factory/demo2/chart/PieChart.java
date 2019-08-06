package create.factory.demo2.chart;

public class PieChart implements Chart {

	public PieChart() {
		System.out.println("这是一个饼状图");
	}
	
	@Override
	public void display() {
		System.out.println("显示饼状图");
	}

}
