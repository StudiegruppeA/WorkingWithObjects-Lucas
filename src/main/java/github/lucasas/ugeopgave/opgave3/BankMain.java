package github.lucasas.ugeopgave.opgave3;

public class BankMain {
    void main() {
        BankAccount bankAccount = new BankAccount("Lucas",122);
        bankAccount.deposit(1212);
        bankAccount.withdraw(23);
        bankAccount.deposit(3414);
        bankAccount.withdraw(2000);
        bankAccount.printTransactionHistory();
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getLargestTransaction());
    }
}
