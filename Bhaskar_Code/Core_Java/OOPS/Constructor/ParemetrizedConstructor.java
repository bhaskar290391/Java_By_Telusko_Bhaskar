package Constructor;

class Humans{
    private int age;
    private String name;


    public Humans(){
        age=12;
        name="Bhaskar";
    }

    
    public Humans(String name) {
        this(2,name);
    }


    public Humans(int age, String name) {
        this.age = age;
        this.name = name;
    }


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


public class ParemetrizedConstructor {
    public static void main(String[] args) {
    
    Humans data=new Humans();
    System.out.println("The age "+data.getAge());
    System.out.println("The name "+data.getName());

    Humans data1=new Humans(29, "kanishk");
    System.out.println("The age "+data1.getAge());
    System.out.println("The name "+data1.getName());


    Humans obj=new Humans("sammy");
        System.out.println("The age "+obj.getAge());
    System.out.println("The name "+obj.getName());
}
}
