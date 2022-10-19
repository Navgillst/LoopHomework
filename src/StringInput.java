import java.util.Scanner;//Importing java.util package

public class StringInput
{
    public static void main(String[] args)
    {
        //Local variable
        String inputString ;
        char occurrenceOfCharacter = 'a';
        int count = 0;

        //creating object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String");//Input message

        inputString = scanner.nextLine();//Getting input through scanner object


        for (int i = 0; i <inputString.length(); i++)// for loop
        {
            if (inputString.charAt(i) == occurrenceOfCharacter)//Checking occurrence oa character 'a'
            {
                count++;//incrementing the value of count by 1

            }

        }
     System.out.println("Total Number of 'a' in the string = "+count);//Printing output

    }
}
