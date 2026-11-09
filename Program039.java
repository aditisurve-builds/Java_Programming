//Approach 3       final

import java.util.Scanner;

class Program38
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        Arithmetic arithmetic = null;     // Reference
        int iValue1 = 0 , iValue2 = 0 , iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter Second Number : ");
        iValue2 = scanner.nextInt();

        arithmetic = new Arithmetic();
        iResult = arithmetic.Addition(iValue1 , iValue2);    

        System.out.println("Addition is : "+iResult);

    }
}

class Arithmetic
{
     public int Addition(int iNo1 , int iNo2)     //non static
    {
        int iAns = 0;
        iAns = iNo1 + iNo2 ;
        return iAns;
    }

}