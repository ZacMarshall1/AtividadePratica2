import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            Prints.ChoicePrints();

            int choice = scanner.nextInt();

            if (scanner.hasNextInt())
            {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else
            {
                scanner.nextLine();
                Prints.DefaultResponse();;
                continue;
            }

            scanner.nextLine();

            switch (choice)
            {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    Prints.Exit();
                    return;
                default:
                    Prints.DefaultResponse();
            }
        
        }
    }
}
