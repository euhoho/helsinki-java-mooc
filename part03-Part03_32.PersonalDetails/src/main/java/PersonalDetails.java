
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestName = 0;
        int sum = 0;
        double average = 0;
        int longOfNumbers = 0;
        String xd = "error";

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");

            int ageBirth = Integer.parseInt(pieces[1]);
            sum = sum + ageBirth;
            longOfNumbers++;

            String name = pieces[0];

            int lengthname = name.length();

            if (lengthname>longestName) {
                longestName = lengthname;
                xd = pieces[0];
            }

        }
        average = (double) sum / longOfNumbers;
        System.out.println("Longest name: "+xd);
        System.out.println("Average of the birth years: "+average);
    }
}
