package github.lucasas.ugeopgave.opgave3;

public class Transaction {
    private final TransactionType type;
    private final double amount;

    public Transaction(TransactionType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                '}';
    }
}
