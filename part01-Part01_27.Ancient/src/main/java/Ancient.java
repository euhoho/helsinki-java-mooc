
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println(year);

        if (year<2015) {
            System.out.println("Ancient history!");
        }
        scanner.close();
    }
}
