
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstnumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondnumber = Integer.parseInt(scanner.nextLine());

        System.out.println(firstnumber+" + "+secondnumber+" = "+(firstnumber+secondnumber));
        System.out.println(firstnumber+" - "+secondnumber+" = "+(firstnumber-secondnumber));
        System.out.println(firstnumber +" * "+secondnumber+" = "+(firstnumber*secondnumber));
        System.out.println(firstnumber +" / "+secondnumber+" = "+(1.0*firstnumber/secondnumber));
        scanner.close();
    }
}
