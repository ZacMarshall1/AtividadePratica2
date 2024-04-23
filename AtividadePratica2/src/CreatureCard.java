public class CreatureCard extends Card
{
    private String type;

    public CreatureCard(String cardName, int damage, int health, int cost, String type)
    {
        super (cardName, damage, health, cost);
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
