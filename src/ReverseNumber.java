import java.util.Scanner;//Importing java.util package

public class ReverseNumber
{
    public static void main(String[] args)
    {
        //Local variables
        int iNumber, reverse = 0;

        //Creating object of Scanner class
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter 5 digit number");//Input message

        iNumber= scanner.nextInt();//Getting input through scanner input

        if(iNumber>=10000&&iNumber<=99999) //Restrict user to input less than and more than 5-digit number
        {
            while (iNumber != 0)
            {
                int remainder = iNumber % 10;//dividing the input number by 10 to get remainder

                //to get the reverse of digit with loop
                reverse = reverse * 10 + remainder;

                iNumber = iNumber / 10;//changing the value of input to get previous digit
            }
            System.out.println("The reverse of the given number is: " + reverse);//Printing reverse number
        }
        else
        {
            System.out.println("Invalid Number");//Error message
        }



    }

}

