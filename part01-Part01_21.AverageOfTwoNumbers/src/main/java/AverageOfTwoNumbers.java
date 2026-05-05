
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstnumber = Integer.parseInt(scanner.nextLine());
         System.out.println("Give the second number:");
        int secondnumber = Integer.parseInt(scanner.nextLine());
        double average = (firstnumber + secondnumber) / 2.0;
        System.out.println("The average is "+ average);
        scanner.close();

    }
}
