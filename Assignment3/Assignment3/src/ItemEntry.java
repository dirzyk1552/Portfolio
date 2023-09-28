public class ItemEntry {
    private final Item item;
    private int quantity;

    // Constructor for item and quantity
    public ItemEntry(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // Get the associated item
    public Item getItem() {
        return item;
    }

    // Get the quantity of items
    public int getQuantity() {
        return quantity;
    }

    // Set the quantity of items
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}