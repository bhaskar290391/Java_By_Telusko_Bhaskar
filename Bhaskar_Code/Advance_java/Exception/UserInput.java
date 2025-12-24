import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // int num=Integer.parseInt(br.readLine());
        // System.out.println("The number is "+num);

        // br.close();

        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        System.out.println("Scannaer data " + data);
    }
}
