package Training;
class Employee1{
	void work() {
		System.out.println("The employee is working");
	}
	double getSalary() {
		return 50000.0;
	}
}
class HRManager extends Employee1{
	void work() {
		System.out.println("The HR manger is managing human resources");
	}
	void addEmployee() {
		System.out.println("An employee has been added to the company");
	}
}



public class Sample4 {

	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		HRManager hr=new HRManager();
		emp.work();
		System.out.println("Employee Salary: $" +emp.getSalary());
		hr.work();
		System.out.println("HR Manager Salary : $"  +hr.getSalary());
		hr.addEmployee();
		

	}

}
