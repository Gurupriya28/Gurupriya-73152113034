public class Example5 {
    Example5(String name) {
		System.out.println("Welcome " +name);
	}
	Example5 (int a,int b) {
		this("Priya");
		System.out.println("Sum :" + (a+b));
	}
	Example5(int n) {
		this(10,20);
		System.out.println("Sum :" +(n+n));
	}

	public static void main(String[] args) {
	
		Example5 obj3=new Example5(5);
	

	} 
}
