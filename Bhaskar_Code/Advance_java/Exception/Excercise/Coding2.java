package Excercise;

/* 

Handling Exceptions in Java: Advanced Exercise: Try-Catch, Throw, and Throws in Action
Write a Java program that validates a user's age for access and throws a custom exception if the age is invalid.

Create a custom exception class named InvalidAgeException that:

Extends Exception

Has a constructor that accepts a message and passes it to super(message)

Create a method named checkAge(int age) that:

Throws InvalidAgeException if the age is less than 18

Otherwise, prints "Access granted"

In the main() method:

Call checkAge(16) and checkAge(21)

Use separate try-catch blocks for each call

If an exception is caught, print:

Exception caught: <message>

Instructions:

Use throw to raise an exception when the age is invalid.

Use throws in the method signature to declare the exception.

Catch the exception in main() and print the error message using e.getMessage().

Print "Access granted" only if no exception is thrown.

Expected Output:

  Exception caught:  Age must be 18 or older

  Access granted


*/
public class Coding2 {
    
}
