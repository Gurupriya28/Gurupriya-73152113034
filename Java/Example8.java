package Training;


class Vehicles {
    void noOfEngine() {
        System.out.println("I have one engine");
    }
}


class TwoWheelerss extends Vehicles {
    void noOfWheels() {
        System.out.println("I have two wheels");
    }
}


class Bike2 extends TwoWheelerss {
    void brandName() {
        System.out.println("Brand name is Honda");
    }
}
class Scooty extends TwoWheelerss{
	void brandName() {
		System.out.println("Brand name is Activa");
	}
}


public class Example8 {
    public static void main(String[] args) {
        Bike2 bike = new Bike2();
        bike.noOfEngine(); 
        bike.noOfWheels(); 
        bike.brandName();   
      
        Scooty scooty=new Scooty();
        scooty.noOfEngine();
        scooty.noOfWheels();
        scooty.brandName();
    }
}
