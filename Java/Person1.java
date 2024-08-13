class Person{
   private String name;
   private int age;

   public Person(String name,int age){
    this.name=name;
    this.age=age;
   }
   public String getName(){
    return name;

   }
   public int getAge(){
    return age;
   }
   public void setName(String name){
    this.name=name;
   }
   public void setAge(int age){
    this.age=age;
   }
}
public class Person1 {
    public static void main(String[] args) {
        Person person1=new Person("Ean Craig",11);
        Person person2=new Person("Evan Boss",12);

        System.out.println(person1.getName() + " is " +person1.getAge() + " years old");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");

        person1.setAge(14);
        person2.setName("Lewis");
        person2.setAge(12);
        System.out.println("New age and name");
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " yaers old.\n");
    }
    
}
