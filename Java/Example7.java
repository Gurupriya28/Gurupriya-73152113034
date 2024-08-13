package Training;


class Vehicle {
    void noOfEngine() {
        System.out.println("I have one engine");
    }
}


class TwoWheelers extends Vehicle {
    void noOfWheels() {
        System.out.println("I have two wheels");
    }
}


class Bike1 extends TwoWheelers {
    void brandName() {
        System.out.println("Brand name is Honda");
    }
}


public class Example7 {
    public static void main(String[] args) {
        Bike1 bike = new Bike1();
        bike.noOfEngine(); 
        bike.noOfWheels(); 
        bike.brandName();   
    }
}
