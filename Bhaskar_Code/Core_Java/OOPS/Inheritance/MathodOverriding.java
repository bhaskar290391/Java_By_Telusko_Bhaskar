class Calculater{
    public int add(int n1,int n2){
        return n1+n2;
    }

}

class AdvanceCalculator extends Calculater{
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}
public class MathodOverriding{
    public static void main(String[] args) {
        
        AdvanceCalculator obj=new AdvanceCalculator();
        int result=obj.add(5, 5);

        System.out.println("The result ==>"+result);

           }
}