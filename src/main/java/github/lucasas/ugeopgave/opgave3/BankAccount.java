package github.lucasas.ugeopgave.opgave3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankAccount {
    private final String owner;
    private double balance;
    private final List<Transaction> transactions = new ArrayList<>();

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount));
        System.out.println("Tilføjede " + amount + " kr. til din konto!");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Du har ikke nok penge på din konto!");
            return;
        }

        balance -= amount;
        transactions.add(new Transaction(TransactionType.WITHDRAW, amount));
        System.out.println("Fjernede " + amount + " kr. til din konto!");
    }

    public void printTransactionHistory() {
        transactions.forEach(System.out::println);
    }

    public Transaction getLargestTransaction() {
        return transactions.stream()
                .max(Comparator.comparingDouble(Transaction::getAmount))
                .orElseThrow();
    }

    public double getBalance() {
        return balance;
    }
}
