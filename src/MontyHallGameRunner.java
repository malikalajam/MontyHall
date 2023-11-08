import java.util.Random;
import java.util.Scanner;

public class MontyHallGameRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Monty Hall Game!");
        System.out.println("Behind one door, there's a car. Behind the other two, there are goats.");

        MontyHallGame game = new MontyHallGame();

        System.out.print("Choose a door (0, 1, or 2): ");
        int userGuess = scanner.nextInt();
        game.setUserGuess(userGuess);

        int revealedGoat;
        if (game.getCarDoor() == userGuess) {
            int tempRevealedGoat;
            do {
                tempRevealedGoat = new Random().nextInt(2) + 1 + userGuess;
            } while (tempRevealedGoat == game.getCarDoor() || tempRevealedGoat == userGuess);
            revealedGoat = tempRevealedGoat % 3;
        } else {
            revealedGoat = 3 - game.getCarDoor() - userGuess;
        }

        System.out.println("Monty reveals a goat behind door " + revealedGoat);
        System.out.print("Do you want to switch doors? (yes/no): ");
        String switchChoice = scanner.next().toLowerCase();

        if (switchChoice.equals("yes")) {
            if (userGuess == game.getCarDoor()) {
                System.out.println("Sorry, you got a goat.");
            } else {
                System.out.println("Congratulations! You won the car!");
            }
        } else {
            if (userGuess == game.getCarDoor()) {
                System.out.println("Congratulations! You won the car!");
            } else {
                System.out.println("Sorry, you got a goat.");
                //
            }
        }
    }
}
