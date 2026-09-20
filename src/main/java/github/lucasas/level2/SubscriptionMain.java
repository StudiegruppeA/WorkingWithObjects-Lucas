package github.lucasas.level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SubscriptionMain {
    List<Subscription> subscriptions = new ArrayList<>();

    void main() {
        Subscription netflix = new Subscription("Netflix", 150, true);
        Subscription disneyPlus = new Subscription("Disney+", 200, true);
        Subscription skyshowtime = new Subscription("SkyShowTime", 300, true);
        Subscription hboMax = new Subscription("Hbo Max", 142, true);
        Subscription prime = new Subscription("Amazon Prime", 453, true);
        subscriptions.add(netflix);
        subscriptions.add(disneyPlus);
        subscriptions.add(skyshowtime);
        subscriptions.add(hboMax);
        subscriptions.add(prime);

        List<Subscription> subscriptionsToCancel = getRandomSubscription(subscriptions, 2);
        for (int i = 1; i <= 12; i++) {
            if (i == 3) {
                subscriptionsToCancel.forEach(Subscription::cancel);
            }
            if (i == 6) {
                getRandomSubscription(subscriptionsToCancel, 1).forEach(Subscription::reactivate);
            }
            subscriptions.forEach(Subscription::renew);
        }
        printAllSubscriptions();
        System.out.println("Billigest " + getCheapestSubscription().getService());
        System.out.println("Total monthly cost " + getTotalMonthlyCost());
        System.out.println("Total cost " + getTotalPaid());
    }

    private void printAllSubscriptions() {
        System.out.println("== Alle Subscriptions ==");
        subscriptions.forEach(Subscription::printInfo);
    }

    private Subscription getCheapestSubscription() {
        return subscriptions.stream()
                .min(Comparator.comparingDouble(Subscription::getMonthlyPrice)).orElse(null);
    }

    private double getTotalMonthlyCost() {
        return subscriptions.stream()
                .filter(Subscription::isAutoRenew)
                .mapToDouble(Subscription::getMonthlyPrice).sum();
    }

    private double getTotalPaid() {
        return subscriptions.stream()
                .filter(Subscription::isAutoRenew)
                .mapToDouble(Subscription::getTotalPaid).sum();
    }


    private List<Subscription> getRandomSubscription(List<Subscription> subscriptions, int amount) {
        List<Subscription> randomSubs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            int index = random.nextInt(subscriptions.size());
            randomSubs.add(subscriptions.get(index));
        }
        return randomSubs;
    }
}
