import java.util.Scanner;//Importing java.util package

public class PrintRangeNumbers
{
    public static void main(String[] args)
    {
        //Local variable
        int startBoundary , endBoundary, range;

        //Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting number of range");//input message
        startBoundary=scanner.nextInt();//Getting input through object

        System.out.println("Enter end number of range");//input message
        endBoundary=scanner.nextInt();//Getting input through object
        range=endBoundary-startBoundary;

        if(range>=10)// if condition to restrict user to enter range less than 10
        {
            //for loop to print 10 numbers
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(startBoundary);

                startBoundary = startBoundary + 1;
            }
        }
        else
        {
            System.out.println("Invalid Range");//Error message

        }

    }
}
