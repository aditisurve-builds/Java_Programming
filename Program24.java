import java.util.Scanner;

class Program24
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        String sName = null;                      // initializing it w null, best practice

        scanner = new Scanner(System.in);          //Best method to create the object!!

        System.out.println("Enter your Name:");
        sName = scanner.next();                  // method

        System.out.println("Welcome "+sName);

    }
}

// next()- when we enter name with space then only first name occurs as next()method stops at space ,,,, by putting underscore instead of space can recover it 
// nextLine()- doesnt stops at space 