package github.lucasas.level4;

public class GameMain {
    void main() {
        Item item1 = new Item("Taske", ItemType.ARMOR, 67);
        Item item2 = new Item("Healing potion", ItemType.POTION, 50);
        Item item3 = new Item("Sværd", ItemType.WEAPON, 22);

        Player player = new Player("Lucas", 4000);
        player.buyItem(item1);
        player.sellItem(item2);
        player.buyItem(item2);
        player.buyItem(item3);

        player.sortByValue();
        player.findItems(ItemType.ARMOR);
        player.sellItem(item1);
        player.findItems(ItemType.ARMOR);
    }
}
