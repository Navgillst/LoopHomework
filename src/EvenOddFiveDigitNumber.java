import java.util.Scanner;//Importing java.util package

public class EvenOddFiveDigitNumber
{
    public static void main(String[] args)
    {

        //Local variable
        int iNumber, singleDigit = 0,sum=0,even=0,odd=0,sum1=0,sum2=0;
        Scanner scanner =new Scanner(System.in);//Creating object of scanner class
        System.out.println("Enter 5 digit number");// Input statement
        iNumber= scanner.nextInt();

        if(iNumber>=10000&&iNumber<=99999)//Restrict user to input less than and more than 5-digit number
        {
            while (iNumber != 0)//checking condition in while loop
            {
                int remainder = iNumber % 10;//dividing the input number by 10 to get remainder

                //to get the single digit which change in every iteration start from last digit then second last and so on
                singleDigit = singleDigit * 10 + remainder;
                iNumber = iNumber / 10;//changing the value of input digit to get previous digit;
                sum = sum + remainder;//calculating sum

                if (remainder % 2 == 0)
                {
                    even = even + 1;
                    sum1 = sum1 + remainder;

                } else {
                    odd = odd + 1;
                    sum2 = sum2 + remainder;

                }

            }
            //Printing result even number, odd number, sum of total number, sum of even, sum of odd
            System.out.println("Total Even Number = " + even);
            System.out.println("Total Odd Number = " + odd);
            System.out.println("The Sum of the given number is: " + sum);
            System.out.println("Sum of Even Numbers  = " + sum1);
            System.out.println("Sum of Odd Numbers  = " + sum2);
        }
        else
        {
            System.out.println("Please enter 5 digit number");//Error message

        }



    }

}
