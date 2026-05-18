
public class YourFirstBankTransfer {

    public static void main(String[] args) {

        Account number1 = new Account("Matthews account", 1000);
        Account number2 = new Account("My account", 0);

        number1.withdrawal(100);
        number2.deposit(100.0);

        System.out.println(number1);
        System.out.println(number2);
    }
}
