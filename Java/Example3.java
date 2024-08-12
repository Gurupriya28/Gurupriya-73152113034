public class Example3 {
    String name;
    Example3(String name){
        this(10,20);
        this.name=name;
        this.greeting();
    }
    Example3(int a , int b){
        System.out.println("Addition " + (a+b));
    }
    void greeting() {
        System.out.println("Welcome " + name);
    }
      public static void main(String[] args) {
          
         Example3 obj=new Example3("Priya");
      }
}
