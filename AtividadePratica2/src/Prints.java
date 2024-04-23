public class Prints 
{
    public static void ChoicePrints() 
    {
        System.out.println("\nWhat is your action?");
        System.out.println("1: If you wish to see your cards.");
        System.out.println("2: If you wish to see your health");
        System.out.println("3: If you wish to create a new card");
        System.out.println("4: If you wish to draw a sacrifice card?");
        System.out.println("5: If you wish to end the program.");
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
