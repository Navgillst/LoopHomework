import java.util.Scanner;//Importing java.util package

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        //Local variable
        int iNumber, limitNumber, printNumber;

        Scanner scanner = new Scanner(System.in);//Creating object of Scanner class

        System.out.println("Enter Number for Table");//Input statement for first input

        iNumber = scanner.nextInt();//Getting input through object

        System.out.println("Enter Number until which number you want to see Table");//input statement for second input

        limitNumber = scanner . nextInt();//Getting input through object

        //for loop to execute until the number user want to see table
        for(int i =1;i<=limitNumber;i++)
        {
            printNumber = iNumber*i;//calculating table
            System.out.println(iNumber+" * "+i +" = "+printNumber);//printing output

        }



    }

}
