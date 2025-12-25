package Utils;

public class WrapperDemo {
 public static void main(String[] args) {
    int num=7;

    Integer data= num; //auto -boxing

    System.out.println(data);

    int num2= data; //unboxing
    System.out.println(num2);

    String str="12";

    System.out.println(Integer.parseInt(str) *2);
 }   
}
