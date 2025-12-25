package Constructor;

class A{
    A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("Inisde the show method");
    }
    
}


public class Anonymous {
    public static void main(String[] args) {
    
    new A().show();// anonomyous object creation
        new A().show();// anonomyous object creation
}
}
