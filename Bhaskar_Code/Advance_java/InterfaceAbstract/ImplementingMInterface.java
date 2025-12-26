interface Interfs{

    int age = 44;//static Final
    String area = "Mumbai";

    void show();
    void playQuiz();
}

 interface X {

    public void run();
}

 interface Y extends X{

    
}

class Datas implements Interfs,Y{

    @Override
    public void show() {System.out.println("Showing");
    }

    @Override
    public void playQuiz() {
        System.out.println("quiz");
    }

    @Override
    public void run() {
       System.out.println("I am running");
    }
    
}
public class ImplementingMInterface {
    public static void main(String[] args) {
        Datas d=new Datas();
        d.playQuiz();
        d.show();

        d.run();

        System.out.println(Interfs.area);
    }
}
