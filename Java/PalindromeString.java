import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		if(s.equals(str)) {
			System.out.println(str + " is a Palindrome");
		}
		else {
			System.out.println(str + " is not a Palindrome");
		}
        sc.close();
	}
}
