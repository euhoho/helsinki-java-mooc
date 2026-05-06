
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        int mult = 1;

        for(int i=1; number>=i; i++) {
            System.out.println(i);
            mult = mult * i;
        }
        System.out.println(mult);
        scanner.close();
    }   
}
