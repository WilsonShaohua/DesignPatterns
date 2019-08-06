package create.factory.demo3.chart_update;

import create.factory.demo2.chart.Chart;
import create.factory.demo2.chart.ChartFactory;

public class Client {
	public static void main(String[] args) {
		Chart chart;		
		String type = XMLUtil.getChartType();		
		chart = ChartFactory.getChart(type);
		chart.display();
	}
}
