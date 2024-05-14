import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        try (Scanner io = new Scanner(System.in)) {
            Random random = new Random();

            System.out.println("Welcome to Dice Roll Simulator!");

            while(true) {
                System.out.print("\nHow many sides should the dice have? ");
                int sides = io.nextInt();

                if (sides <=1) {
                    System.out.println("\nInvalid number of sides. Number of sides must be greater than 1.");
                    continue;
                }

                System.out.println("\nPress enter to roll the " + sides + "-sided dice , or type \"exit\" to quit: ");
                String input = io.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("\nThanks for playing!");
                    break;
                }

                int diceValue = random.nextInt(sides) + 1;
                System.out.println("\nYou rolled: " + diceValue);


                System.out.print("\nPress enter to roll again, or type 'exit' to quit: ");
                String rollAgain = io.nextLine();
                if (rollAgain.equalsIgnoreCase("exit")) {
                    System.out.println("\nThanks for playing!");
                    return;
                }
            }
            io.close();
        }
    }
}
