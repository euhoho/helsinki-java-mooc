
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstnumber = Integer.parseInt(scanner.nextLine());
        int secondnumber = Integer.parseInt(scanner.nextLine());

        if (firstnumber>secondnumber) {
            System.out.println(firstnumber+" is greater than "+secondnumber);
        } else if (firstnumber<secondnumber) {
            System.out.println(firstnumber+" is smaller than "+secondnumber);
        } else {
            System.out.println(firstnumber+" is equal to "+secondnumber);
        }
        scanner.close();
    }
}
