interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Coding, compile and run ...");
    }
}

class Desktop implements Computer{
    public void code(){
                System.out.println("Coding, compile and run ...Fatster");
    }
}

class Developer {

    public void develop(Computer comps){
        comps.code();
    }
    
}
public class InterfaceNeed {
    public static void main(String[] args) {
        
        Laptop lap=new Laptop();
        Desktop desk=new Desktop();
        Developer develop=new Developer();
        develop.develop(desk);

    }
}
