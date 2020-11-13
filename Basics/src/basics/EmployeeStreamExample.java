package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EmployeeStreamExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		for (int i = 0; i < 20; i++) {
			Employee employee = new Employee();
			employee.setId(i);
			int randomNum = ThreadLocalRandom.current().nextInt(10000, 60000);
			employee.setName("a" + randomNum);
			employee.setSalary(randomNum);
			employees.add(employee);
		}

		// to create the stream of employees
		// List<Employee> employees2 = employees.stream().filter(emp ->
		// emp.getSalary()>35000).collect(Collectors.toList());
		// for (Employee employee : employees2) {
		// System.out.println(employee);
		// }

		// to print the list of employees using the filter condition
		employees.stream().filter(emp -> emp.getSalary() > 35000).forEach(System.out::println);
	}

}
