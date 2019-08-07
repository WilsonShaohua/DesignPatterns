package behavioral.vistor;

import java.util.ArrayList;

public class EmployeeList {
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public void accept(Department department) {
		for (Object object : employees) {
			((Employee)object).accept(department);
		}
	}
}
