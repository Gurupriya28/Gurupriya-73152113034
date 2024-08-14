package Training;
class Vehicle1{
	void makeDrive() {
		System.out.println("Vehicle can move");
	}
}
class Car extends Vehicle1{
	void makeDrive() {
		System.out.println("Repairing the car");
	}
}

public class Sample2 {

	public static void main(String[] args) {
		Vehicle1 v=new Vehicle1();
		Vehicle1 car=new Car();
		
		v.makeDrive();
		car.makeDrive();

	}

}
