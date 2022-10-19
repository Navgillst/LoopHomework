import java.util.Scanner;//Importing java.util package

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        //Local variable
        int number1=0, number2=1, storeNumber, nNumber;
        System.out.println("Enter n Number");//Input Statement

        Scanner scanner =new Scanner(System.in);//Creating object of Scanner class
        nNumber=scanner.nextInt();//Getting input through object

        //for loop
        for(int i= number1;i<= nNumber;i++)
        {
            storeNumber=number1+number2;//storing the sum of first number and second number into storenumber

            System.out.println(storeNumber);//printing sum

            number1=number2;//changing the value of number1 as number2

            number2=storeNumber;//changing the value of number2 as storenumber
        }



    }
}
