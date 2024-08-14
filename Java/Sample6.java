package Training;
class Animal1 {
	void move() {
		System.out.println("Animal can move");
	}
}
class Cheetah extends Animal1 {
	void move() {
		System.out.println("Cheetah can ru fast");
	}
}


public class Sample6 {

	public static void main(String[] args) {
		Animal1 a=new Animal1();
		Animal1 c=new Cheetah();
		
		a.move();
		c.move();

	}

}
