interface Interf{

    int age = 44;//static Final
    String area = "Mumbai";

    void show();
    void playQuiz();
}

class Data implements Interf{

    @Override
    public void show() {System.out.println("Showing");
    }

    @Override
    public void playQuiz() {
        System.out.println("quiz");
    }
    
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Data d=new Data();
        d.playQuiz();
        d.show();

        System.out.println(Interf.area);
    }
}
