import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(10) + 1;
        System.out.println(targetNumber);

        System.out.println("Input your number please");
        Scanner scanner = new Scanner(System.in);

        int userInput = 0;
        while (userInput != targetNumber) {
            try {
                userInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            if (userInput > targetNumber) {
                System.out.println("Your guess is too high!");
            } else if (userInput < targetNumber) {
                System.out.println("Your guess is too low!");
            }
        }

        System.out.println("Your guess is correct! The random number was " + targetNumber);
    }
}