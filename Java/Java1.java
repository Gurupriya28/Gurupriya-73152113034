package Lab;
class Animal {
	void move() {
		System.out.println("All animals move from one place to another");
	}
	void eat() {
		System.out.println("All animals will eat something");
	}
}
class Dog extends Animal {
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
public class Java1 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.move();
		dog.eat();
	
	}

}
