/**
 * Problem 5
 */
abstract class BankAccount {
    int accountNumber;
    double balance;

    abstract void deposit();

    abstract void withdraw();

}

class SavingsAccount extends BankAccount {

    void deposit() {
        balance += 500;
        System.out.println("balance added");
    }

    void withdraw() {
        balance -= 100;
        System.out.println("balance credited");
    }
}

public class Abstract {
    public static void main(String[] args) {
        SavingsAccount ob = new SavingsAccount();
        ob.deposit();
        ob.withdraw();
    }
}
