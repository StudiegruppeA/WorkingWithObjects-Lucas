package github.lucasas.level4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Player {
    private final String name;
    private int gold;
    private final List<Item> inventory = new ArrayList<>();

    public Player(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }


    public void buyItem(Item item) {
        if (!hasEnoughGold(item)) {
            System.out.println("Du har ikke nok guld til at købe dette item");
            return;
        }
        gold -= item.getValue();
        addItem(item);
    }

    public void sellItem(Item item) {
        if (removeItem(item)) {
            System.out.println("Du har fået " + item.getValue() + " guld tilbage");
            gold += item.getValue();
        }
    }

    public void findItems(ItemType type) {
        List<Item> items = inventory.stream()
                .filter(item -> item.getType() == type)
                .toList();
        printItems(items);
    }

    public void sortByValue() {
        List<Item> items = inventory.stream()
                .sorted(Comparator.comparingInt(Item::getValue))
                .toList();
        printItems(items);
    }

    private void addItem(Item item) {
        inventory.add(item);
        System.out.println(item.toString() + " er blevet tilføjet til dit inventory");
    }

    private boolean removeItem(Item item) {
        if (!inventory.contains(item)) {
            System.out.println("Du kan ikke fjerne et item, som du ikke har");
            return false;
        }
        System.out.println(item.toString() + " er blevet fjernet fra dit inventory");
        inventory.remove(item);
        return true;
    }

    private boolean hasEnoughGold(Item item) {
        return gold >= item.getValue();
    }

    private void printItems(List<Item> list) {
        System.out.println("==== Items =====");
        list.forEach(System.out::println);
        System.out.println("========");
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", gold=" + gold +
                ", inventory=" + inventory +
                '}';
    }
}
