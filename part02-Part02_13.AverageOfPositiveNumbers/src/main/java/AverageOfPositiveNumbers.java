
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int totalsum = 0;

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                if (sumOfNumbers == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                double average = (1.0 * totalsum) / sumOfNumbers;
                System.out.println(average);
                break;
            }
            if (number>0) {
                totalsum = totalsum + number;
                sumOfNumbers = sumOfNumbers + 1;
            }
        }
        scanner.close();
    }
}
