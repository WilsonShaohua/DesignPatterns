package create.factory.demo2.chart;

public class ChartFactory {
	public static Chart getChart(String type) {
		Chart chart=null;
		if("histogram".equalsIgnoreCase(type)){
			chart = new HisogarmChart();
			System.out.println("初始化设置柱状图");
		}else if("pie".equalsIgnoreCase(type)) {
			chart = new PieChart();
			System.out.println("初始化设置饼状图");
		}else if("line".equalsIgnoreCase(type)){
			chart = new LineChart();
			System.out.println("初始化设置折线图");
		}		
		return chart;
	}
}
