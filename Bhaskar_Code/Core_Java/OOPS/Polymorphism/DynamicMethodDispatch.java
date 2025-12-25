class A {
public void show(){
    System.out.println("in A' shows method");
}
}

class B extends A{
public void show(){
    System.out.println("in B' shows method");
}
}

class C extends A{
public void show(){
    System.out.println("in C' shows method");
}
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();
    }
}
