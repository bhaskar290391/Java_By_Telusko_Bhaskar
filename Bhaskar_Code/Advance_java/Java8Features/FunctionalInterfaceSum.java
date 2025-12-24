@FunctionalInterface
interface Sum{
    public int sum(int i,int j);

}

public class FunctionalInterfaceSum {
    public static void main(String[] args) {
        
        Sum obj= (i,j) -> i+j;

        System.out.println("The addition of two nummber is " +obj.sum(10, 15));
    }
}
