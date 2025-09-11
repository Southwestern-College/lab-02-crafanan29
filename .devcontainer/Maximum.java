/**
 * This program find the maximum between a set of 3 numbers input by the user using if and else statments.
 * @author Cameron Rafanan or @crafanan29 on GitHub
 */
import java.util.Scanner;

public class Maximum 
{
    public static void main(String[] args)
    {
        int number1, number2, number3;                  // Declaring integers
        Scanner input = new Scanner(System.in);         // Creating a new Scanner

        System.out.print("Enter the 1st integer: ");    // Prompting the user to enter a value
        number1 = input.nextInt();                      // ".nextInt()" because number1 is an int

        System.out.print("Enter the 2nd integer: ");
        number2 = input.nextInt();

        System.out.print("Enter the 3rd integer: ");
        number3 = input.nextInt();

        int max = number1;                              // The first input will be the maximum

        if(number2 > max)                               // If a value is bigger, it will become the maximum
            max = number2;
        
        if (number3 > max)                              // If this value is bigger, 'max' will be reassigned
            max = number3;
        
        System.out.println("The maxmimum is " + max);  // Prints the maxmimum value
        input.close();                                 // Closes scanner
    }
}