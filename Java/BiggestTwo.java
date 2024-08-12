import java.util.Scanner;
public class BiggestTwo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1,num2;
System.out.println("Enter number 1:");
num1=sc.nextInt();
System.out.println("Enter number 2:");
num2=sc.nextInt();
if(num1>num2){
System.out.println(num1 + " is the Biggest Number ");
}
else{
System.out.println(num2 + " is the Biggest Number");
}
sc.close();
}
}
