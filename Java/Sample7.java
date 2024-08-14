package Training;
class Person {
    private String firstName;
    private String lastName;

    
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    String getFirstName() {
        return firstName;
    }

    
    String getLastName() {
        return lastName;
    }
}


class Employees extends Person {
    private String employeeId;
    private String jobTitle;

   
    Employees(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

   
    String getEmployeeId() {
        return employeeId;
    }

    
    @Override
    String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}


public class Sample7 {
    public static void main(String[] args) {
      
        Person person = new Person("John", "Doe");
        
      
        Employees employee = new Employees("Jane", "Smith", "E12345", "Software Engineer");

       
        System.out.println("Person First Name: " + person.getFirstName());
        System.out.println("Person Last Name: " + person.getLastName());

        
        System.out.println("Employee First Name: " + employee.getFirstName());
        System.out.println("Employee Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
