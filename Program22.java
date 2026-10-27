import java.util.Scanner;

class Program22
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);  // System.in = from where will we take input - keyboard ,,scanner = object ,Scanner = class

        System.out.println("Enter your Name:");
        String sName = scanner.nextLine();

        System.out.println("Welcome "+sName);

    }
}