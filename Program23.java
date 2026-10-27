import java.util.Scanner;

class Program23
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        String sName = null;                      // initializing it w null, best practice

        scanner = new Scanner(System.in);          //Best method to create the object!!

        System.out.println("Enter your Name:");
        sName = scanner.nextLine();

        System.out.println("Welcome "+sName);
    }
}