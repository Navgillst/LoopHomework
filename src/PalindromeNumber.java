import java.util.Scanner;//Importing java.util package

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        //Local variable
        int iNumber, reverse = 0,userInput;

        //Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");//Input message
        iNumber = scanner.nextInt();//Getting input through object
        userInput = iNumber;//putting the value of user input into variable userInput

            while (iNumber != 0)//while condition
            {
                int remainder = iNumber % 10;//dividing the input number by 10 to get remainder
                reverse = reverse * 10 + remainder;//to get the reverse of digit with loop
                iNumber = iNumber / 10;//changing the value of input to get previous digit
            }
            //If reverse of number equal to original number
            if (reverse == userInput)
            {
                System.out.println("Palindrome Number");//Output Message
            } else {
                System.out.println("Not Palindrome Number");//Output Message
            }
        }


}
