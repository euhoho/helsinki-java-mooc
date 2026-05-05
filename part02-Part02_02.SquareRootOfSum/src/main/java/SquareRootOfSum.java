
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstnumber = Integer.parseInt(scanner.nextLine());
        int secondnumber = Integer.parseInt(scanner.nextLine());

        int sum = firstnumber + secondnumber;
        double squeareRoot = Math.sqrt(sum);
        System.out.println(squeareRoot);
        scanner.close();
    }
}
