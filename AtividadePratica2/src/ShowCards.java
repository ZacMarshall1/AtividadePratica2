public class ShowCards 
{
    public static void printDeck(CreatureCard[] deck) 
    {
        System.out.println("Your cards so far...");
        if (deck[0] == null) 
        {
            System.out.println("Your deck is empty, perhaps you should make some new cards.");
        } else {
            for (CreatureCard card : deck) 
            {
                if (card != null) 
                {
                    System.out.println("Name: " + card.getCardName());
                    System.out.println("Damage: " + card.getDamage());
                    System.out.println("Health: " + card.getHealth());
                    System.out.println("Cost: " + card.getCost());
                    System.out.println("Type: " + card.getType() + "\n");
                }
            }
        }
    }
}
