public class DrawSacCard 
{
    public static SacCard[] drawSacCard(int numCards) 
    {
        SacCard[] sacCards = new SacCard[numCards];
        for (int i = 0; i < numCards; i++) 
        {
            sacCards[i] = new SacCard("");
        }
        return sacCards;
    }

    public static void printSacCardCount(SacCard[] sacCards) 
    {
        int count = sacCards.length;
        System.out.println("Number of Sac Cards: " + count);
    }
}

