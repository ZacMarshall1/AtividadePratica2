public class Card
{
    private String cardName;
    private int damage;
    private int health;
    private int cost;

    public Card(String cardName, int damage, int health, int cost)
    {
        this.cardName = cardName;
        this.damage = damage;
        this.health = health;
        this.cost = cost;
    }

    public String getCardName()
    {
        return cardName;
    }

    public void setCardName(String cardName)
    {
        this.cardName = cardName;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }
}
