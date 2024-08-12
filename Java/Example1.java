public class Example1 {
    int b=20; //Instance or Object Variable
	static int c=30;
	public static void main(String args[]) {
		int a=10;
		System.out.println("Local variable: " +a);
	  Example1 obj=new Example1();
	  System.out.println(obj.b);
	  
	  System.out.println(Example1.c);
	}

}
