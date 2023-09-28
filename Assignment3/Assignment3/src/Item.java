public class Item {
    private String title;
    private double price;

    // Constructor with validation for price
    public Item(String title, double price) {
        this.title = title;
        setPrice(price);
    }

   //Getters and Setters
    public String getTitle() {
        return title;
    }

   
    public void setTitle(String title) {
        this.title = title;
    }

 
    public double getPrice() {
        return price;
    }

  
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }
}
