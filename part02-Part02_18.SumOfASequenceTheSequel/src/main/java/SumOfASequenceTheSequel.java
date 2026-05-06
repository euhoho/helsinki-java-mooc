
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number ? ");
        int firstnumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Last number? ");
        int lastnumber = Integer.parseInt(scanner.nextLine());

        int tulos = 0;

        for (int i=firstnumber; lastnumber>=i; i++) {
            tulos = tulos + i;
        }

        System.out.println("The sum is "+ tulos);
        scanner.close();
    }
}
