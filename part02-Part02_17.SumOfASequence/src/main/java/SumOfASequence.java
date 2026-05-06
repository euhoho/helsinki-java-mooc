
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number ? ");
        int lastnumber = Integer.parseInt(scanner.nextLine());
        int tulos = 0;

        for(int i=1; i<=lastnumber; i++) {
            tulos = i + tulos;
        }
        System.out.println(tulos);
        scanner.close();
    }
}
