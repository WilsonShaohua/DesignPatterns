package create.factory.demo2.chart;



public class Client {
	public static void main(String[] args) {
		Chart chart;
		chart = ChartFactory.getChart("histogram");
		chart.display();
	}

}
