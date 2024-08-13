class Dog {
    
    private String name;
    private String breed;

    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

 
    public void printDetails() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Labrador");

        
        System.out.println("Initial details:");
        dog1.printDetails();
        dog2.printDetails();

        
        dog1.setName("Charlie");
        dog1.setBreed("Beagle");
        dog2.setName("Rocky");
        dog2.setBreed("German Shepherd");

        
        System.out.println("\nUpdated details:");
        dog1.printDetails();
        dog2.printDetails();
    }
}
