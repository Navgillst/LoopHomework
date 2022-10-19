import java.util.Scanner;//Importing java.util package

public class FactorialNumber
{
    public static void main(String[] args)
    {
        //local variables
        int i, factorial=1;
        int number;//It is the number to calculate factorial
        Scanner scanner = new Scanner(System.in);//creating object of Scanner class

        System.out.println("Enter any number");//Input statement
        number = scanner.nextInt();//Getting input through object
        //condition to access for block
        if (number>=0)
        {
            //loop to run until number input by user
            for (i = 1; i <= number; i++)
            {

                factorial = factorial * i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);//Printing output
        }
        else
        {
            System.out.println("Please enter positive integer");//error message
        }

    }
}
