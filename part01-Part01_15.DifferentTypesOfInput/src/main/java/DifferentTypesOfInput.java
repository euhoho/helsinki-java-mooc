
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String string = scanner.nextLine();
        System.out.println("Give an integer:");
        String integer = scanner.nextLine();
        int conversionint = Integer.parseInt(integer);
        System.out.println("Give a double:");
        String doublee = scanner.nextLine();
        double conversiondouble = Double.parseDouble(doublee);
        System.out.println("Give a boolean:");
        String booleann = scanner.nextLine();
        boolean conversionboolean = Boolean.parseBoolean(booleann);

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + conversionint);
        System.out.println("You gave the double " + conversiondouble);
        System.out.println("You gave the boolean " + conversionboolean);
        scanner.close();

    }
}
