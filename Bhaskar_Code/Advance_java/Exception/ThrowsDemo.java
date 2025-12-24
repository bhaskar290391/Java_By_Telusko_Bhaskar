class A {
    public void show() throws ClassNotFoundException{

        //Class.forName("ThrowsDemo");
        Class.forName("ThrowsDemosss");
    }
}

public class ThrowsDemo {
public static void main(String[] args) {
    A obj =new A();

   

        int i=16;
        int j=0;

        try {
             obj.show();
        }catch(ClassNotFoundException e){
            System.out.println("Class Not found Exception");
        }
        
        System.out.println(j);

        System.out.println("bye");
}
     
}