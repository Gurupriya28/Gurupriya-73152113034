
    class Employee{
        //Variables
        int employeeId;
        String employeeName;
        float employeeSalary;
        
        //constructor
        Employee(int employeeId, String employeeName , float employeeSalary){
            this.employeeId=employeeId;
            this.employeeName=employeeName;
            this.employeeSalary=employeeSalary;
        }
        
        //Method
        void display() {
            System.out.println("Employee id : " + employeeId);
            System.out.println("Employee Name : " + employeeName);
            System.out.println("Employee Salary : " + employeeSalary);
        }
    }
    public class Example {
    
        public static void main(String[] args) {
            Employee emp1=new Employee(101,"Mouni Roy",25000.0f);
            emp1.display();
            Employee emp2=new Employee(102,"Arjun",45000.0f);
            emp2.display();
            
            
    
        }
    
}
