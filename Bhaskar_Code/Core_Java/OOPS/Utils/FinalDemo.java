package Utils;
//final class Data{

class Data{
    // public final void show(){
    public void show(){
        System.out.println("By Kanishk Data Show method");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class AdvanceData extends Data{
    public void show(){
        System.out.println("By Bhaskar Data Show method");
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        
        final int data=9;

        //data=10; //we cannot assigned chnages the value of final variable


        AdvanceData obj=new AdvanceData();



    }
}
