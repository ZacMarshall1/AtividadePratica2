public class SacCardDrawer 
{
    public void DrawSacCard(SacCard[] sacDeck) 
    {
        for (int i = 0; i < sacDeck.length; i++) 
        {
            if (sacDeck[i] == null) {
                sacDeck[i] = new SacCard();
                break;
            }
            if (i == sacDeck.length - 1) 
            {
                System.out.println("Don't be greedy. Your Sacrifice Deck is already full.");
            }
        }
    }
}
