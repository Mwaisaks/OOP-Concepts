public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item1 = new Item("Croissants", 10);
        Item item2 = new Item("Burgers", 5);

        inventory.addItem(item1);
        inventory.addItem(item2);

        inventory.displayInventory();

        System.out.println("Star this Repo :)");
    }
}

