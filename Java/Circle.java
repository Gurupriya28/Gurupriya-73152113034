class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method
    public double getRadius() {
        return radius;
    }

    // Setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to print the circle's details
    public void printDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        // Creating an instance of Circle
        Circle circle = new Circle(5.0);

        // Printing initial details
        System.out.println("Initial details:");
        circle.printDetails();

        // Modifying radius using setter method
        circle.setRadius(7.0);

        // Printing updated details
        System.out.println("\nUpdated details:");
        circle.printDetails();
    }
}
