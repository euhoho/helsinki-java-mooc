
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstnumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondnumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int thirdnumber = Integer.parseInt(scanner.nextLine());

        double average = (firstnumber + secondnumber + thirdnumber) / 3.0;

        System.out.println("The average is "+average);
        scanner.close();
    }
}
