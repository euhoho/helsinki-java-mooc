
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sumOfTheNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                System.out.println("Number of numbers: " + numberOfNumbers);
                System.out.println("Sum of the numbers: " + sumOfTheNumbers);
                break;
            }

            numberOfNumbers = numberOfNumbers + 1;
            sumOfTheNumbers = sumOfTheNumbers + number;
        }
        scanner.close();
    }
}
