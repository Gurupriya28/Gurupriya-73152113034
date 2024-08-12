import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int rem,res=0;
		int num=n;
		while(num!=0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num/=10;
		}
		if(res==n) {
			System.out.println(n + " is a Armstrong number");
		}
		else {
			System.out.println(n + " is not a Armstrong number");
		}
     sc.close();
	}
}
