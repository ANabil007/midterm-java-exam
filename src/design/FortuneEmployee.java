package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		//using parameterized constructor to assign Id and methods
		EmployeeInfo emp1 = new EmployeeInfo(1);
		emp1.employeeName("Jack");
		emp1.assignDepartment(20);
		System.out.println("Name: " + emp1.employeeName() +", Id :" + emp1.employeeId() + ", Dept: "+ emp1.getDepartment());
		System.out.println("Salary: " + emp1.calculateSalary(40,40));


		//using default constructor and methods
		EmployeeInfo emp2 = new EmployeeInfo();
		emp2.employeeId(2);
		emp2.employeeName("John");
		emp2.assignDepartment(30);
		System.out.println("Name: " + emp2.employeeName() +", Id :" + emp2.employeeId() + ", Dept: "+ emp2.getDepartment());
		System.out.println("Salary: " + emp2.calculateSalary(25,50));

		//Using parameterized  constructor to assign both name and Id
		EmployeeInfo emp3 = new EmployeeInfo("Mike",3);
		emp3.assignDepartment(40);
		System.out.println("Name: " + emp3.employeeName() +", Id :" + emp3.employeeId() + ", Dept: "+ emp3.getDepartment());
		System.out.println("Salary: " + emp3.calculateSalary(35,65));











	}

}
