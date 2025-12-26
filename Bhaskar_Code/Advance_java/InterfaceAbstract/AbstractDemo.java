abstract class  Car{
    public abstract void drive();
    public abstract void fly();
    public  void playMusic(){
        System.out.println("Playing Music");
    }
}

abstract class WagonR extends Car{

    public void drive(){
        System.out.println("Driving");
    }

}

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying");
    }
}

public class AbstractDemo{
    public static void main(String[] args) {
     Car obj=new UpdatedWagonR();
     obj.fly();
     obj.drive();
     obj.playMusic();   
    }
}