
import java.util.Arrays;
import java.util.Scanner;

class Student {
    int regNo;
    String name;
    int[] marks = new int[5];
    int sum = 0;
    int avg;
    String grade;
    
    Student(int regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }
    
    void getMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
        }
        sc.close();
    }
    
    void calculateGrade() {
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        avg = sum / marks.length;
        
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else if (avg >= 50) {
            grade = "E";
        } else {
            grade = "Fail";
        }
    }
    
    void displayReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total Marks: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }


}

public class GradeCalculation {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe");
        student.getMarks();
        student.calculateGrade();
        student.displayReport();

        
    }

}
