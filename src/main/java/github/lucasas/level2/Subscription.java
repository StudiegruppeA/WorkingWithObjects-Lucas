package github.lucasas.level2;

public class Subscription {
    private final String service;
    private final double monthlyPrice;
    private boolean autoRenew;
    private int monthsActive;

    public Subscription(String service, double monthlyPrice, boolean autoRenew) {
        this.service = service;
        this.monthlyPrice = monthlyPrice;
        this.autoRenew = autoRenew;
    }

    public String getService() {
        return service;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public boolean isAutoRenew() {
        return autoRenew;
    }

    public void renew() {
        if (!autoRenew) {
            return;
        }
        monthsActive++;
    }

    public void reactivate() {
        autoRenew = true;
    }

    public void cancel() {
        autoRenew = false;
    }

    public double getTotalPaid() {
        return monthlyPrice * monthlyPrice;
    }

    public double getYearlyCost() {
        return monthlyPrice * 12;
    }

    public boolean isCheaperThan(Subscription other) {
        return this.monthlyPrice < other.monthlyPrice;
    }

    public void printInfo() {
        System.out.println("== "+ service+ " ==");
        System.out.println("Monthly: " + monthlyPrice + " kr");
        System.out.println("Months active: " + monthsActive);
        System.out.println("Total paid: " + getTotalPaid() + " kr");
        System.out.println("Auto-renew: " + autoRenew);
        System.out.println("==========");
    }
}
