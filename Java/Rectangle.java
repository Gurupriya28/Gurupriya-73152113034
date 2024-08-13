class Rectangle {
    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter methods
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Method to print the rectangle's details
    public void printDetails() {
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        // Creating an instance of Rectangle
        Rectangle rectangle = new Rectangle(5.0, 7.0);

        // Printing initial details
        System.out.println("Initial details:");
        rectangle.printDetails();

        // Modifying attributes using setter methods
        rectangle.setWidth(8.0);
        rectangle.setHeight(10.0);

        // Printing updated details
        System.out.println("\nUpdated details:");
        rectangle.printDetails();
    }
}
