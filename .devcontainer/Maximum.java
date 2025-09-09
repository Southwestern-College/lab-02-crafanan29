/*
 * This program determines the maxmimum number between 3 integers using if statements and else statments
 * @author Cameron Rafanan or @crafanan29 on GitHub
 */
import java.util.Scanner;

public class Maximum 
{
    public static void main(String[] args)
    {
        int number1, number2, number3, max;             // Declaring integers
        Scanner input = new Scanner(System.in);         // Creating a new Scanner

        System.out.print("Enter the 1st integer: ");    // Prompting the user to enter a value
        number1 = input.nextInt();                      // ".nextInt()" because number1 is an int

        System.out.print("Enter the 2nd integer: ");
        number2 = input.nextInt();

        System.out.print("Enter the 3rd integer: ");
        number3 = input.nextInt();

        // Determine the maximum
        if (number1 >= number2)                         // If a value is bigger, it will become the maximum
            max = number1;
        else
            max = number2;

        if (number3 >= max)                            // If this value is bigger, 'max' will be reassigned
            max = number3;

        System.out.println("The maxmimum is " + max);  // Prints the maxmimum value
        input.close();                                 // Closes scanner
    }
}