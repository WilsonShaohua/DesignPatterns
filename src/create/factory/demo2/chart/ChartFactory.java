package create.factory.demo2.chart;

public class ChartFactory {
	public static Chart getChart(String type) {
		Chart chart=null;
		if("histogram".equalsIgnoreCase(type)){
			chart = new HisogarmChart();
			System.out.println("��ʼ��������״ͼ");
		}else if("pie".equalsIgnoreCase(type)) {
			chart = new PieChart();
			System.out.println("��ʼ�����ñ�״ͼ");
		}else if("line".equalsIgnoreCase(type)){
			chart = new LineChart();
			System.out.println("��ʼ����������ͼ");
		}		
		return chart;
	}
}
