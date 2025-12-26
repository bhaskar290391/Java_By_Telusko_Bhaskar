class B{

    public void show(){
        System.out.println("In B's show");
    }
}


public class AnanomyousInnerClass {
    public static void main(String[] args) {
        B obj=new B(){
            @Override
            public void show() {
                System.out.println("Overide the show method of B class");
            }
        };


obj.show();
    }
}
