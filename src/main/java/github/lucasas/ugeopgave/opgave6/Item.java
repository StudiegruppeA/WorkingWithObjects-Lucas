package github.lucasas.ugeopgave.opgave6;

public class Item {
    private final String name;
    private final ItemType type;
    private final int value;

    private static int itemsCreated = 0;
    private static int totalValue = 0;

    public Item(String name, ItemType type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
        itemsCreated++;
        totalValue += value;
    }

    public int getValue() {
        return value;
    }

    public ItemType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static int getItemsCreated() {
        return itemsCreated;
    }

    public static double getAverageItemValue() {
        return (double) totalValue / itemsCreated;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
