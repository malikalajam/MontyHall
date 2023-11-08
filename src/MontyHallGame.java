import java.util.Scanner;
import java.util.Random;

class MontyHallGame {
    private int carDoor;
    private int userGuess;

    public MontyHallGame() {
        Random random = new Random();
        carDoor = random.nextInt(3);
    }

    public void setUserGuess(int guess) {
        userGuess = guess;
    }

    public int getCarDoor() {
        return carDoor;
    }
}