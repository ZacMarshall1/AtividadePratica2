public class Prints 
{
    public static void ChoicePrints() 
    {
        System.out.println("\nWhat is your action?");
        System.out.println("1: See your cards?");
        System.out.println("2: See your health?");
        System.out.println("3: Create a new card?");
        System.out.println("4: Draw a sacrifice card?");
        System.out.println("5: Exit program.");
    }

    public static void Exit()
    {
        System.out.println("I hope you had fun...");
    }

    public static void DefaultResponse()    
    {
        System.out.println("I will not allow that option, try another one. \n");
    }
}
