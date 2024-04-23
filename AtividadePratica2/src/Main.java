import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CreatureCard[] deck = new CreatureCard[10];

        while (true)
        {
            Prints.ChoicePrints();

            if (scanner.hasNextInt())
            {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice)
                {
                    case 1:
                        ShowCards.printDeck(deck);
                        break;
                    case 2:

                        break;
                    case 3:
                        CreatureCreator.CreateCard(deck);
                        break;
                    case 4:

                        break;
                    case 5:
                        Prints.Exit();
                        return;
                    default:
                        Prints.DefaultResponse();
                        break;
            
                }
            } else 
            {
                scanner.nextLine();
                Prints.DefaultResponse();
            }
        }
    }
}
