/*
 * This program determines the maxmimum number between 3 integers using if else statments
 * @author Cameron Rafanan or @crafanan29 on GitHub
 */
import java.util.Scanner;

public class Maximum 
{
    public static void main(String[] args)
    {
        int number1, number2, number3, max;             // Declaring integers
        Scanner input = new Scanner(System.in);         // Creating a new Scanner

        System.out.print("Enter the 1st integer: ");
        number1 = input.nextInt();                      // ".nextInt()" because number1 is an int

        System.out.print("Enter the 2nd integer: ");
        number2 = input.nextInt();

        System.out.print("Enter the 3rd integer: ");
        number3 = input.nextInt();

        //  Determine the maximum
        if(number1 >= number2) 
        {
            max = number1;
        }
        else                                            // This line will run if number2 is greater than number1
        {
            max = number2;
            if (max >= number3)                      // I did not know that I can put if statements inside else statements
            {
                max = number3;
            }
            else 
            {
                if (number1 >= number3)
                {
                    max = number1;
                }
                else
                {
                    max = number3;
                }
                
             }
        }
        System.out.println("The maxmimum is "+ max);    //Prints the maxmimum value
        input.close();                                  // Closes scanner
    }
}