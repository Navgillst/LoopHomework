import java.util.Scanner;//Importing java.util package

public class SumOfFiveDigitNumber
{
    public static void main(String[] args)
    {
                //Local variables
                int iNumber, singleDigit = 0,sum=0;
                Scanner scanner =new Scanner(System.in);//creating object of scanner class

                //Input message in console
                System.out.println("Enter 5 digit number");

                iNumber= scanner.nextInt();//Getting input through object

                if(iNumber>=10000&&iNumber<=99999)//Restrict user to input less than and more than 5-digit number
                {

                    while (iNumber != 0)//checking condition in while loop
                    {
                        int remainder = iNumber % 10;//dividing the input number by 10 to get remainder

                        //to get the single digit which change in every iteration start from last digit then second last and so on
                        singleDigit = singleDigit * 10 + remainder;

                        iNumber = iNumber / 10;//changing the value of input digit to get previous digit

                        sum = sum + remainder; //calculating the sum of all digits through loop

                    }
                    System.out.println("The Sum of the given number is: " + sum);//printing output in console
                }
                else
                {
                    System.out.println("Please Enter only 5 digit number");//Error message for invalid input
                }


    }


}


