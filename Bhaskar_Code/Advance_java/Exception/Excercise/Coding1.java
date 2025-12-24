package Excercise;

/*

Handling Arithmetic Exceptions in Java: Divide by Zero Safely
You are given two already-declared integer variables:

int numerator = 50;
int denominator = 0;
Write a Java program that divides the numerator by the denominator and handles any division by zero using a try-catch block.

If an exception occurs, print:

Cannot divide by zero
Regardless of whether an exception occurs or not, print:

Program completed


Instructions:

Use the already-declared numerator and denominator.

Perform division inside a try block.

Catch ArithmeticException and print "Cannot divide by zero".

After the try-catch, print "Program completed".



Expected Output:

  Cannot divide by zero

  Program completed

*/
public class Coding1 {
    public static void main(String[] args) {
      
          int numerator = 50;
          int denominator = 0;
          int result=0;
          try{
            result= numerator/denominator;
          }catch(ArithmeticException exception){
            System.out.println("Cannot divide by zero");
          }

          System.out.println("Program completed");
    }
}
