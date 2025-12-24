import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("enter the number");
            int num=Integer.parseInt(br.readLine());
            System.out.println("The number is "+ num);


        }
    }
}
