public class PlayerCard extends Card 
{
    public PlayerCard() 
    {
        super("Player", 0, 5, 0);
    }

    public int getPlayerHealth()
    {
        return this.getHealth();
    }
}