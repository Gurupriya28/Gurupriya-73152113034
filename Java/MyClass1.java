import java.util.Scanner;
public class MyClass1{
 public static void main(String args[]){
  int employeeId;
  String employeeName;
  float employeeSalary;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter employee id");
  employeeId=sc.nextInt();
  System.out.println("Enter Employee Name");
  employeeName=sc.next();
  System.out.println("Enter employee Salary:");
employeeSalary=sc.nextFloat();

   System.out.println("Employee id: " +employeeId);
   System.out.println("Employee name: " + employeeName);
 System.out.println("Employee Salary:"  +employeeSalary);

 sc.close();;
    }
 }