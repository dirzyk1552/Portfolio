import java.io.IOException;
import java.util.Scanner;

public class OnlineStore {
    private static final String FILE_PATH = "data.txt";
    private ItemInventory itemInventory;
//loading ItemInventory
    public void start() throws IOException {
        itemInventory = ItemInventory.load(FILE_PATH);
//scanner to read user's input
        Scanner scanner = new Scanner(System.in);
//switch statements to handle the menu
        while (true) {
            printMainMenu();
            int n = scanner.nextInt();

            if (n == 5)
                break;

            switch (n) {
                case 1:
                    showAllItems();
                    break;
                case 2:
                    showItemsByType("music");
                    break;
                case 3:
                    showItemsByType("book");
                    break;
                case 4:
                    showItemsByType("software");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
//prompts for user to select
    private void printMainMenu() {
        System.out.println("Welcome to eMart");
        System.out.println("1) Show all items.");
        System.out.println("2) Show only music CDs.");
        System.out.println("3) Show only books.");
        System.out.println("4) Show only software.");
        System.out.println("5) Exit program.");
        System.out.print("Your Choice[1-5]: ");
    }
//method to show all items
    private void showAllItems() {
        printHeader();
        for (ItemEntry itemEntry : itemInventory.getEntries()) {
            printItem(itemEntry);
        }
    }
//method to specifically show certain item types
    private void showItemsByType(String itemType) {
        printHeader();
        for (ItemEntry itemEntry : itemInventory.getEntries()) {
            Item item = itemEntry.getItem();
            if (itemType.equals(getType(item))) {
                printItem(itemEntry);
            }
        }
    }
//printing header
    private void printHeader() {
        System.out.printf("%-30s %10s %10s %10s\n", "Title", "Type", "Price", "Quantity");
    }
//printing item list
    private void printItem(ItemEntry itemEntry) {
        Item item = itemEntry.getItem();
        System.out.printf("%-30s %10s %10.2f %10d\n", item.getTitle(), getType(item), item.getPrice(), itemEntry.getQuantity());
    }
//method to get what type of item it is 
    private static String getType(Item item) {
        if (item instanceof Book)
            return "book";
        if (item instanceof MusicCD)
            return "music";
        if (item instanceof Software)
            return "software";
        return "unknown";
    }
}
