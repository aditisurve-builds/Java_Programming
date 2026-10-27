import java.util.Scanner;

class Program28
{
    public static void main(String A[])
    {
        Scanner scanner = null;
        String sName = null; 
        int iAge = 0;
        float fMarks = 0.0f;          // initializing it w null compulsory , best practice

        scanner = new Scanner(System.in);          //Best method to create the object!!

        System.out.println("Enter your Name:");
        sName = scanner.next();
                                                      /*  Exception as when we enter name with space the next() method 
                                                      takes only first name as after space and second name after space nextInt takes it thts y exception
                                                      so in next code 29 we wrote nextLine() method so even after space it doesnt go to nextInt() method */       
        System.out.println("Enter your Age:");  
        iAge = scanner.nextInt();  

        System.out.println("Enter your Marks:");
        fMarks = scanner.nextFloat();                    

        System.out.println("Welcome "+sName);
        System.out.println("Your Age is :"+iAge);
        System.out.println("Your Marks is :"+fMarks);

    }
}
