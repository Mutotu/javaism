import java.util.Scanner;

public class Gamble {
    public static void main(String[] args) throws DiceSelectionException{
        Scanner userInput = new Scanner(System.in);

        int userDiceSelection = 0;
        int userRandomRoll = (int)Math.floor(Math.random() * (6-1) + 1 );
        int userRandomRollHigh = (int)Math.floor(Math.random() * (12-1) + 1);

        System.out.println("What is your name?\n");
        String userName = userInput.nextLine();

        System.out.println("Hello " + userName + " welcome to our Gable game \n" );
        do{
            System.out.println("Press 1 for 1 dice and for 2 for 2 dice");
            userDiceSelection = userInput.nextInt();
        }while(userDiceSelection < 1 || userDiceSelection > 2);

        if(userDiceSelection == 1) System.out.println("You rolled a " + userRandomRoll);
        else if (userDiceSelection == 2) System.out.println("You rolled a + " + userRandomRollHigh);
        else throw new DiceSelectionException("Usser dice selection failer. CLosing application");
    }
}
