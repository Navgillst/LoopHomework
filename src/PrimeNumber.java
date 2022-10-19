import java.util.Scanner;//Importing java.util package

public class PrimeNumber
{
    public static void main(String[] args)
    {
        //Local variable
        int number, i;
        //boolean variable for true or false
        boolean numPrime=true;

        //Creating the object of scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number :- ");//Input message
        number = scanner.nextInt();//Getting input through object
        if(number>1) //Restrict user to input negative numbers or less than one
        {

            // Loop to divide number by all the numbers less than user input number
            for (i = 2; i < number; i++) {
                if (number % i == 0)//if condition to check given number is divisible by any other number
                {

                    numPrime = false;
                }
            }
            //if numPrime is true then number is prime
            if (numPrime) {
                System.out.println("It is Prime number");
            } else//not a prime number
            {
                System.out.println("Not a prime number");
            }
        }
        else
        {
            System.out.println("Enter valid number");//Error message
        }



    }

}
