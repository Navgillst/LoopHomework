import java.util.Scanner;//Importing java.util package

public class SumOfNaturalNumber
{
    public static void main(String[] args)
    {
        //Local variables with initialization of value 0 to iSum variable
        int iNumber, iSum = 0;

        //creating object of Scanner class from java.util package
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Natural Number");//Input message

        //To get user input through scanner object
        iNumber = scanner.nextInt();

        //condition to restrict the access any invalid numbers to entering for loop
        if(iNumber>=0)
        {
            //for loop to calculate sum of natural number
            for (int i = 0; i <= iNumber; i++)
            {
                iSum = iSum + i;
            }
            System.out.println("Sum of Natural Number = " + iSum);//Output message
        }
        else
        {
            //Error message if given number is not natural number
            System.out.println("Invalid Number");
        }
    }
}
