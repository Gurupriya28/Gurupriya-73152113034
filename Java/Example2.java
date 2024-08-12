public class Example2 {
    void myMethod() {
		System.out.println("Instance Method");
	}
	static void myMethod2() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		Example2 obj=new Example2();
		obj.myMethod();
		
		Example2.myMethod2();
		

	}

}
