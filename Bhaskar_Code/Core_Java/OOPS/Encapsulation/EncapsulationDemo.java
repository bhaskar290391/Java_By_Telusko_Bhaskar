package Encapsulation;

class Human{
    private int age;
    private String name;


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
public class EncapsulationDemo{
public static void main(String[] args) {
    
    Human data=new Human();
    data.setAge(34);
    data.setName("Bhaskar");

    System.out.println("The age "+data.getAge());
    System.out.println("The name "+data.getName());

}
}