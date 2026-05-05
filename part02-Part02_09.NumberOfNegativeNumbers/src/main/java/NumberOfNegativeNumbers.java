
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negative = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());

            if (number<0) {
                negative = negative + 1;
                continue;
            }

            if (number==0) {
                System.out.println("Number of negative numbers: "+negative);
                break;
            }

        }
        scanner.close();
    }
}
