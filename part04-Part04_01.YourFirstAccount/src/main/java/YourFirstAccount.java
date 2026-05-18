
public class YourFirstAccount {

    public static void main(String[] args) {

        Account exampleAccount = new Account("Alvaro", 100.0);

        exampleAccount.deposit(20.0);

        System.out.println(exampleAccount);
    }
}
