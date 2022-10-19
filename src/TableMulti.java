import java.util.Scanner;//Importing java.util package

public class TableMulti
{
    public static void main(String[] args)
    {
        //Local variables
        int tableColumn, tableRow;

        //Creating thr object of Scanner class
        Scanner scanner = new Scanner(System.in);

        //Displaying message to console
        System.out.println("Enter number of column");

        tableColumn = scanner.nextInt();//getting input through object

        //Displaying message to console
        System.out.println("Enter number of Row");

        tableRow =scanner.nextInt();//getting input through object
        int i = 1;

        do {
           int j = 1;//Local variable inside do-while
            do {
                System.out.print(i * j+" ");//Loop to multiplication of 1*j
                j++;//Increasing the value of j by 1 after every repetition of nested do-while

            } while (j <= tableColumn);//checking condition of nested do-while

            i++;//increment the value of i by 1 after every repetition of do-while block

           System.out.println();//to print output in next line

        }while (i<= tableRow);//checking the condition for do-while block
    }
}
