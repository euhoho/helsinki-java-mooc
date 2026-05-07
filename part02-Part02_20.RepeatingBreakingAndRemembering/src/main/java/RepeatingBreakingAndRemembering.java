
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int sumOfNumbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Write numbers:");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum = sum + number;

            sumOfNumbers = sumOfNumbers + 1;

            average = (double) sum / sumOfNumbers;

            if (number % 2 == 0) {
                even = even +1;
            }

            if (number % 2 != 0) {
                odd = odd +1;
            }
        }

        System.out.println("Thx, bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + sumOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        scanner.close();
    }
}
