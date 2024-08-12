import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			System.out.println(ch + " is " + (int)ch);
		}
        sc.close();

	}
}
