import java.util.Scanner;
public class main
{
    public static String input(String prompt)
    {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim().toLowerCase();
    }
    public static void print(int year, int month, int days)
    {
        if(year < 2022 && month < 12 && days < 30)
        {
            year = 2022 - year;
            month = 12 - month - 1;
            days = 30 - days;
            System.out.println(" You are " + year + " years old ");
            System.out.println(" And you are " + month + " month old ");
            System.out.println(" And you are approximitely " + days + " days old ");
        }

        else
        {
            System.out.print("you input wrong date");

        }
    }
    public static boolean askforagain()
    {
        String userInput = input("Do you want to continue? (Yes or No)\n");
        return userInput.equalsIgnoreCase("Yes");
    }

    public static void main(String[] args)
    {
        do
        {
            Scanner qqq = new Scanner(System.in);
            int year = 0;
            int month = 0;
            int days = 0;
            System.out.println("What year you were born?");
            year = qqq.nextInt();
            System.out.println("What month you were born?");
            month = qqq.nextInt();
            System.out.println("What day you were born?");
            days = qqq.nextInt();
            print(year, month, days);
        }
        while(askforagain());
    }
}