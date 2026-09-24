package github.lucasas.ugeopgave.opgave6;


import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final String playerName;
    private final int maxCapacity;
    private final List<Item> items = new ArrayList<>();

    public Inventory(String playerName, int maxCapacity) {
        this.playerName = playerName;
        this.maxCapacity = maxCapacity;
    }

    public void addItem(Item item) {
        if (items.size() >= maxCapacity) {
            System.out.println("Ikke mere plads");
            return;
        }
        System.out.println("Tilføjede " + item.getName() + " til inventoryet!");
        items.add(item);
    }

    public List<Item> findItems(ItemType type) {
        return items.stream()
                .filter(item -> item.getType() == type)
                .toList();
    }

    public int getTotalValue() {
        return items.stream().mapToInt(Item::getValue).sum();
    }

    public void printInventory() {
        System.out.println("==== Items =====");
        items.forEach(System.out::println);
        System.out.println("========");
    }
}
