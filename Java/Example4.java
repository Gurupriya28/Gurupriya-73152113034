public class Example4 {
    void myMethod(String name) {
		System.out.println("Welcome " +name);
	}
	void myMethod(int a,int b) {
		System.out.println("Sum :" + (a+b));
	}
	void myMethod(int n) {
		System.out.println("Sum :" +(n+n));
	}

	public static void main(String[] args) {
		Example4 obj=new Example4();
		obj.myMethod(5);
		obj.myMethod("Priya");
		obj.myMethod(10,20);

	}

}
