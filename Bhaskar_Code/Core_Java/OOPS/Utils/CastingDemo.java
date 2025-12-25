package Utils;


class A{
        public void show1(){
            System.out.println("In A's show");
        }
}
class B extends A{
    public void show2(){
        System.out.println("In B 's show");
    }
}
public class CastingDemo {
 public static void main(String[] args) {
    A obj=new B();
    obj.show1();


    B obj1= (B)obj;
    obj1.show2();
 }   
}
