/** Caro professor, nesta classe estou utilizando Integer.parseInt() que serve para que mesmo se um dado for lido como string, ele ser interpretado como
* número inteiro pelo programa, para der uma certa resistência ao código, assim como o uso de try e catch, para previnir que tipos de dado não
*antecipados fossem adicionados ao objeto.
*Foi algo que pesquisei sobre durante a confecção do código, e achei melhor justificar aqui,
*já que não abordamos isso nas aulas, para evitar problemas futuros. Muito orbigado por sua atenção <3
*/




import java.util.Scanner;

public class CreatureCreator
{
    private static Scanner scanner = new Scanner(System.in);

    public static CreatureCard CreateCard(CreatureCard[] deck) 
    {
        try 
        {
            System.out.println("\nNow you must name your creature, choose wisely.");
            String cardName = scanner.nextLine();
    
            System.out.println("Choose a number of damage for that card to deal, it's your call.");
            int damage = Integer.parseInt(scanner.nextLine());
    
            System.out.println("Health. Such an important feature. I wonder if you would build a glass cannon, or an impenetrable defense.");
            int health = Integer.parseInt(scanner.nextLine());
    
            System.out.println("The cost. That's the time you must use your sacrifice cards. It would be unfair to play a godly creature with no cost at all, wouldn't it?");
            int cost = Integer.parseInt(scanner.nextLine());

            System.out.println("And finally, the type. It is a remarkable feature of your card. Keep in mind that each type has its own quirks. You may choose between lizard, bird, canine, or deer.");
            String type = scanner.nextLine().toLowerCase();

            if (!isValidType(type)) 
            {
                System.out.println("Invalid type. Please choose one of the following: lizard, bird, canine, deer");
                return CreateCard(deck);
            }

            for (int i = 0; i < deck.length; i++)
            {
                if (deck[i] == null)
                {
                    deck [i] = new CreatureCard(cardName, damage, health, cost, type);
                    System.out.println("You added " + cardName + "to your deck.");
                    break;
                }
            }

    
            System.out.println("Card created successfully:");
            System.out.println("Name: " + cardName);
            System.out.println("Damage: " + damage);
            System.out.println("Health: " + health);
            System.out.println("Cost: " + cost);
            System.out.println("Type: " + type);
    
            return new CreatureCard(cardName, damage, health, cost, type);
    
        } catch (NumberFormatException e) {
            System.out.println("Nice try. Although I shall not fall for that foul trick.");
            return CreateCard(deck);
        }
    }

    private static boolean isValidType(String type) 
    {
        return type.equals("lizard") || type.equals("bird") || type.equals("canine") || type.equals("deer");
    }
}    
