import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CreatureCard[] deck = new CreatureCard[10];
        PlayerCard playerCard = new PlayerCard();
        SacCard[] sacDeck = new SacCard[4];
        SacCardDrawer sacCardDrawer = new SacCardDrawer();

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
                        System.out.println("Your current vitality is sitting at " + playerCard.getPlayerHealth() + ". I would be careful with that if i were you." );
                        break;
                    case 3:
                        CreatureCreator.CreateCard(deck);
                        break;
                    case 4:
                        sacCardDrawer.DrawSacCard(sacDeck);
                        break;
                    case 5:
                        ShowSacCards.printSacDeck(sacDeck);
                        break;
                    case 6:
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
