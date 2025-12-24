public class TryWithMultipleCases {
    public static void main(String[] args) {
        

        int i=3;
        int j=0;
        int num[]=new int[5];
        String str=null;

        try {
            j=15/i;
             System.out.println(num[5]);
            System.out.println(str.length());
           

        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Be in your limit");
        }catch (Exception e) {
            System.out.println("Something went wrong"+e);
        }
}
}
