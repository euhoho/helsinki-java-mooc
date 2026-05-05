
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());

        if (number%2==0) {
            System.out.println("Number "+number+" is even");
        } else if (number%2!=0) {
            System.out.println("Number "+number+" is odd");
        }
        scanner.close();
    }
}
