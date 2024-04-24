public class ShowSacCards 
{
    public static void printSacDeck(SacCard[] sacDeck) 
    {
        if (sacDeck[0] == null) 
        {
            System.out.println("You have no Sacrifice Cards. I shall advise you to draw some before it's too late.");
        } else {
            System.out.println("Your cards so far...");
            for (SacCard card : sacDeck) 
            {
                if (card != null) 
                {
                    System.out.println("Name: " + card.getCardName());
                    System.out.println("Damage: " + card.getDamage());
                    System.out.println("Health: " + card.getHealth());
                    System.out.println("Cost: " + card.getCost() + "\n");
                }
            }
        }
    }
}
