package github.lucasas.ugeopgave.opgave6;

public class GameMain {
    void main() {
        Item item1 = new Item("Taske", ItemType.ARMOR, 67);
        Item item2 = new Item("Healing potion", ItemType.POTION, 50);
        Item item3 = new Item("Sværd", ItemType.WEAPON, 22);

        Inventory inventory = new Inventory("Lucas",12);
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        inventory.printInventory();

        System.out.println(inventory.findItems(ItemType.ARMOR).toString());
        System.out.println(Item.getItemsCreated());
        System.out.println(Item.getAverageItemValue());
        System.out.println(inventory.getTotalValue());
    }
}
