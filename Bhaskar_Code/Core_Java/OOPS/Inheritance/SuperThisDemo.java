class A{

    public A(){
        super();
        System.out.println("In A's");
    }

    public A(int n){
        super();
        System.out.println("In A's Int");
    }
}

class B extends A{

    public B(){
        super();
        System.out.println("In B's");
    }

    public B(int n){
        this();
        System.out.println("In B's Int");
    }
}

class SuperThisDemo{
    public static void main(String[] args) {
        B obj=new B(5);    
    }
}