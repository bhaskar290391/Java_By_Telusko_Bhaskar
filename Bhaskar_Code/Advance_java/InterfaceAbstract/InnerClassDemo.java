class A{

    int age;

    public void show(){
        System.out.println("In show");
    }

    static class B{

        public void config(){
            System.out.println("inisde the config");
        }
    }

}


public class InnerClassDemo {
public static void main(String[] args) {
    A obj=new A();

    A.B obj1= new A.B();

    obj.show();
    obj1.config();
}    
}
