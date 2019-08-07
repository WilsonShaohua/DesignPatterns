package behavioral.vistor;

public class FADepartment extends Department {

	@Override
	public void visit(FulltimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double weekWage = employee.getWeeklyWage();
		if (workTime > 40) {
			weekWage = weekWage + (workTime - 40) * 100;
		} else if (workTime < 40) {
			weekWage = weekWage - (40 - workTime) * 80;
		}
		System.out.println("��ʽԱ��" + employee.getName() + "ʵ�ʹ���Ϊ��" + weekWage);
	}

	@Override
	public void visit(ParttimeEmployee employee) {
		int workTime = employee.getWorkTime();
		double hourWage = employee.getHourWage();
		System.out.println("��ʱ��" + employee.getName() + "ʵ�ʹ���Ϊ��" + hourWage * workTime);
	}

}
