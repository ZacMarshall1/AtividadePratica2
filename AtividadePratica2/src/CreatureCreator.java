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

    public static Card CreateCard()
    {
        try
        {
            System.out.println("Now you must name you creature, choose wisely.");
            String cardName = scanner.nextLine();

            System.out.println("Choose a number of damage for that card to deal, it's your call.");
            int damage = Integer.parseInt(scanner.nextLine());

            System.out.println("Health. Such an important feature. I wonder if you would build a glass cannon, or an impenetrable defense.");
            int health = Integer.parseInt(scanner.nextLine());

            System.out.println("And finally, the cost. That's the time you must use your sacrifice cards. It would be unfair to play a godly creature with no cost at all, wouldn't it?");
            int cost = Integer.parseInt(scanner.nextLine());

            return new Card(cardName, damage, health, cost);
        } catch (NumberFormatException e) 
        {
            System.out.println("Nice try. Although i shall not fall for that foul trick.");
            return CreateCard();
        }
    }
}
