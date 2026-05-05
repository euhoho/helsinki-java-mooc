
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int totalofnumbers=0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number==0) {
                double average = (1.0 * sum) / totalofnumbers;
                System.out.println("Average of the numbers: "+average);
                break;
            }
            sum = sum + number;
            totalofnumbers = totalofnumbers +1;
        }
        scanner.close();
    }
}
