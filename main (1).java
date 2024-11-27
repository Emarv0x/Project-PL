import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate 3 unique correct numbers from 1 to 7
        HashSet<Integer> correctNumSet = new HashSet<>();
        while (correctNumbersSet.size() < 3) {
            correctNumSet.add(random.nextInt(7) + 1);
        }

        int[] correctNum = correctNum.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Correct numbers: " + correctNum[0] + ", " + correctNum[1] + ", " + correctNum[2]);

        int attempts = 5;

        while (attempts > 0) {
            System.out.print("Enter 3 unique numbers from 1 to 7: ");
            int[] userNumbers = new int[3];
            HashSet<Integer> userInputSet = new HashSet<>();
            boolean validInput = true;

            for (int i = 0; i < 3; i++) {
                int num = scanner.nextInt();
                if (num < 1 || num > 7 || !userInputSet.add(num)) {
                    System.out.println("Error! Please enter unique numbers from 1 to 7.");
                    validInput = false;
                    i--; // Retry this iteration
                } else {
                    userNum[i] = num;
                }
            }

            if (!validInput) continue;

            int correctCount = 0;
            for (int number : userNum) {
                for (int correctNum : correctNum) {
                    if (number == correctNumber) {
                        correctCount++;
                        break;
                    }
                }
            }

            if (correctCount == 3) {
                System.out.println("Congratulations! You guessed all the numbers!");
                return;
            }

            System.out.println("Correct guesses: " + correctCount);
            attempts--;
            System.out.println("Remaining attempts: " + attempts);
        }

        System.out.println("You lose! The correct numbers were: " + correctNumbers[0] + ", " + correctNumbers[1] + ", " + correctNumbers[2]);
        scanner.close();
    }
}