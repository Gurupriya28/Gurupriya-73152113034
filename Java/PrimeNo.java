import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
//		int count=0;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==0&&n>1)
//			
//		{
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("Not Prime");
//		}
		boolean isPrime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(n + " Prime ");
		}
		else
		{
			System.out.println(n + " is not a prime ");
		}
        sc.close();

	}

}
