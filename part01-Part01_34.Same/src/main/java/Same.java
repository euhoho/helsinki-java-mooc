
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstphrase = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondphrase = scanner.nextLine();

        if (firstphrase.equals(secondphrase)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        scanner.close();
    }
}
