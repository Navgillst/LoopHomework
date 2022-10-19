public class NumberDivisibleBy3And5
{

    public static void main(String[] args)
    {
        numberDivisibleBy3();//calling method numberDivisibleBy3

        System.out.println("-----------------------");//output line to separate two methods

        numberDivisibleBy5();//calling method numberDivisibleBy5

    }
    //creating function
    public static void numberDivisibleBy3()
    {
        int i;//local integer variable

        //for loop to run from 1 to 100
        for(i=1;i<=100;i++)
        {

            if(i%3==0)//condition to check if number divisible by 3
            {

            System.out.println(i + " is divisible by 3 ");//output message

            }
        }
    }
    public static void numberDivisibleBy5()
    {
        int j;//local integer variable

        //for loop to run from 1 to 100
        for(j=1;j<=100;j++)
        {
            if(j%5==0)//condition to check if number divisible by 5
            {
                System.out.println(j+" is divisible by 5");//output message

            }
        }
    }
}
