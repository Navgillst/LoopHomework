import java.util.Scanner;//Importing java.util package

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        //Local variable
        int iNumber, result=0, userInput;
        Scanner scanner = new Scanner(System.in);//Creating object of Scanner class
        System.out.println("Enter any number");//Input message
        iNumber = scanner.nextInt();//
        userInput = iNumber;
        while (iNumber != 0)
        {
            int remainder = iNumber % 10;//dividing the input number by 10 to get remainder

            result +=Math.pow(remainder, 3);//calculating the power

            iNumber = iNumber / 10;//Changing the value of input number
        }
        if (result == userInput)//Condition to check if number is armstrong or not
        {
            System.out.println("Armstrong Number");//Printing output
        }
        else
        {
            System.out.println("Not Armstrong Number");//printing output
        }

    }
}
