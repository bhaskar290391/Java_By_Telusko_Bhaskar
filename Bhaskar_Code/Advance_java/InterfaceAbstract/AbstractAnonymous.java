abstract class C {

    public abstract void show();
    public abstract void play();

}

public class AbstractAnonymous {
    public static void main(String[] args) {
        
        C obj=new C() {
        @Override
        public void play() {
            System.out.println("I am playing");
            
        }

        @Override
            public void show() {
                // TODO Auto-generated method stub
                            System.out.println("I am showing");
            }
        };

        obj.play();
        obj.show();
    }
}
