package github.lucasas.level4;

public class Item {
    private final String name;
    private final ItemType type;
    private final int value;

    private static int itemsCreated = 0;

    public Item(String name, ItemType type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
        itemsCreated++;
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

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
