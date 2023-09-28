import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ItemInventory {
    private ArrayList<ItemEntry> entries;

    // 
    private ItemInventory() {
        entries = new ArrayList<>();
    }

    public static ItemInventory load(String fileName) throws IOException {
    	//opening file stream
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream))) {
        	//creating new instance of ItemInventory
            ItemInventory itemInventory = new ItemInventory();
//Reading all lines of the file
            String line;
            while ((line = reader.readLine()) != null) {
            	//splitting the lines into parts
                String[] parts = line.split("\\|");
                String itemType = parts[0];
                String title = parts[1];
                double price;
                int quantity;
                ItemEntry itemEntry;
//creating instances of music, software, and book
                switch (itemType) {
                    case "music":
                        price = Double.parseDouble(parts[8]);
                        quantity = Integer.parseInt(parts[9]);
                        String artist = parts[2];

                        Calendar calendar = Calendar.getInstance();
                        String[] datePart = parts[3].split("/");
                        int year = Integer.parseInt(datePart[2]);
                        int month = Integer.parseInt(datePart[0]);
                        int date = Integer.parseInt(datePart[1]);
                        calendar.set(year, month, date);
                        Date releaseDate = calendar.getTime();
                        String label = parts[4];
                        String recordCompany = parts[5];
                        int totalLength = Integer.parseInt(parts[6]);
                        String genres = parts[7];

                        MusicCD musicCD = new MusicCD(title, price, artist, releaseDate, label, recordCompany, totalLength, genres);
                        itemEntry = new ItemEntry(musicCD, quantity);
                        break;

                    case "software":
                        price = Double.parseDouble(parts[3]);
                        quantity = Integer.parseInt(parts[4]);
                        String version = parts[2];

                        Software software = new Software(title, price, version);
                        itemEntry = new ItemEntry(software, quantity);
                        break;

                    case "book":
                        price = Double.parseDouble(parts[6]);
                        quantity = Integer.parseInt(parts[7]);
                        String author = parts[2];
                        String publisher = parts[3];
                        String edition = parts[4];
                        int publisherYear = Integer.parseInt(parts[5]);

                        Book book = new Book(title, price, author, edition, publisher, publisherYear);
                        itemEntry = new ItemEntry(book, quantity);
                        break;

                    default:
                       
                        itemEntry = null;
                        break;
                }

                if (itemEntry != null) {
                    itemInventory.entries.add(itemEntry);
                }
            }

            return itemInventory;
        }
    }

    // Getter method.
    public ArrayList<ItemEntry> getEntries() {
        return entries;
    }
}
