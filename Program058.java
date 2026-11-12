import java.util.Scanner;
class Program58
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();

        System.out.println("Enter the frequency :");
        iValue = scanner.nextInt();     //taking input from user

        iteration.Display(iValue); 
    }
}

class Iteration
{
    public void Display(int iNo)  
    {
        int iCnt = 0;   

        //Input Filter
        if(iNo <= 0)    //if negative number entered by user then it enters if 
        {
            System.out.println("Invalid Input");

            return ;  //Directly out it doesnt go futher in for loop
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
             System.out.println("Jay Ganesh...");
        }
    }
}