
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstnumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondnumber = Integer.parseInt(scanner.nextLine());
        int sum = firstnumber + secondnumber;
        System.out.println("The sum of the numbers is "+ sum );
        scanner.close();
    }
}
