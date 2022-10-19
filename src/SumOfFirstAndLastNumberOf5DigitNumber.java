import java.util.Scanner;//Importing java.util package

public class SumOfFirstAndLastNumberOf5DigitNumber
{
    public static void main(String[] args)

        {
            //Local variable
            int iNumber, singleDigit = 0,sum=0,firstDigit=0,lastDigit=0;

            Scanner scanner =new Scanner(System.in);//creating the object of scanner class

            System.out.println("Enter 5 digit number");//Input message

            iNumber= scanner.nextInt();// Getting user input through object

            lastDigit =iNumber%10;//

            if(iNumber>=10000&&iNumber<=99999) //Restrict user to input less than and more than 5-digit number
            {

                while (iNumber != 0) //checking condition in while loop
                {
                    for (int i = 1; i <= 5; i++)
                    {
                        int remainder = iNumber % 10;//dividing the input number by 10 to get remainder

                        //to get the single digit which change in every iteration start from last digit then second last and so on
                        singleDigit = singleDigit * 10 + remainder;

                        iNumber = iNumber / 10;//changing the value of input digit to get previous digit;

                        sum = sum + remainder;//calculating sum all digit

                        if (i == 1)//condition for first digit
                        {
                            lastDigit = remainder;
                            System.out.println(lastDigit);
                            lastDigit = lastDigit;
                        }
                        else if (i == 5)//condition for 5th digit
                        {
                            firstDigit = remainder;
                            firstDigit = firstDigit;
                            System.out.println(firstDigit);
                        }
                    }
                }
                int total = firstDigit + lastDigit;//Calculating the total of first and last digit

                System.out.println("The Sum of the First and last Digit  is: " + total);//Output Result
            }
            else
            {
                System.out.println("Invalid Number");//Error message
            }


        }
}


