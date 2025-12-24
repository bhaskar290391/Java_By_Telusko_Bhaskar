public class ThrowDemo {
    public static void main(String[] args) {
        

        int i=16;
        int j=0;

        try {
            j=15/i;
            if(j==0){
                throw new ArithmeticException("I dont want to print exception");
            }
           

        }catch(ArithmeticException e){
            j=15;
           System.out.println("This is default value of j "+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Be in your limit");
        }catch (Exception e) {
            System.out.println("Something went wrong"+e);
        }

        System.out.println(j);

        System.out.println("bye");
}
}
