package Training;
class TwoWheeler{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}
public class Example6 {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfWheels();
		bike.brandName();
		
	}

}
