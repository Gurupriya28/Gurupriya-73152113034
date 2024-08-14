package Lab;
class Animal1 {
	int a=20;
	void move() {
		System.out.println("All animals move from one place to another");
	}
	void eat() {
		System.out.println("All animals will eat something");
	}
}
class Dog1 extends Animal1 {
	int a=20;
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
public class Java2 {

	public static void main(String[] args) {
		Animal1 animal;
		animal=new Dog1();
		animal.move();
		animal.eat();
		
		System.out.println(animal.a);
//		Dog dog=new Dog();
//		dog.move();
//		dog.eat();
	
	}

}
