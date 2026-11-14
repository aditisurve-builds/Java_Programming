import java.util.Scanner; 

class Digit
{
    public int CountDigits(int iNo)
    {
         int iCount = 0;
         int iDigit = 0;

        if(iNo < 0)         
        {
            iNo = -iNo;
        }
        while(iNo != 0)
        {
            iDigit = iNo % 10;   
            iNo = iNo / 10;                  
            iCount++; 
        }
         return iCount;
    }
}
class Program126
{
    public static void main(String A[])
    {
        int iRet = 0;
        Scanner scanner = new Scanner(System.in);
        Digit digit = new Digit(); 

        System.out.println("Enter a Number :");
        int iValue = scanner.nextInt(); 

        iRet = digit.CountDigits(iValue);

         System.out.println("Number of digits :"+iRet);
   
    }
}    