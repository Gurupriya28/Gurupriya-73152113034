package Training;


class Shape {
    
    double getArea() {
        System.out.println("Area calculation is not defined for this shape.");
        return 0;
    }
}


class Rectangle extends Shape {
    private double width;
    private double height;

    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

   
    @Override
    double getArea() {
        return width * height;
    }
}


public class Sample3 {
    public static void main(String[] args) {
        Shape myShape = new Shape();  
        Shape myRectangle = new Rectangle(5, 10);  

        
        System.out.println("Area of rectangle: " + myRectangle.getArea());  
    }
}
