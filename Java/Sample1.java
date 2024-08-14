package Training;

class Animal{
	void makeSound() {
		System.out.println("The animal makes sound");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("The cat meows");
	}
}

public class Sample1 {

	public static void main(String[] args) {
	  Animal myAnimal=new Animal();
	  Animal myCat=new Cat();
	  
	  myAnimal.makeSound();
	  myCat.makeSound();

	}

}
