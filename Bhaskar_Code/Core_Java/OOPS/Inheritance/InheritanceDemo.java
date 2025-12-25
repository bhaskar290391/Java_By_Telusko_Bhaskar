class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class AdvanceCalc extends Calc{
    public int multi(int n1,int n2){
        return n1*n2;
    }

    public int div(int n1,int n2){
        return n1/n2;
    }
}
public class InheritanceDemo{
    public static void main(String[] args) {
        
        //AdvanceCalc adv=new AdvanceCalc();
        ScientificCalc adv=new ScientificCalc();
        int r1=adv.add(4, 4);
                int r2=adv.sub(5, 4);
                        int r3=adv.multi(4, 8);
                                int r4=adv.add(10, 4);
double r5= adv.power(4);
    System.out.println(r1+" : "+r2+" : "+ r3+" : "+ r4+" :"+r5);
    }
}