public class Book extends Item {
    private String author;
    private String edition;
    private String publisher;
    private int pubYear;

    // Constructor method
    public Book(String title, double price, String author, String edition, String publisher, int pubYear) {
        super(title, price);
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.pubYear = pubYear;
    }

 //Getters and Setters
    public String getAuthor() {
        return author;
    }

   
    public void setAuthor(String author) {
        this.author = author;
    }

   
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    // Accessor for publisher
    public String getPublisher() {
        return publisher;
    }

 
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public int getPubYear() {
        return pubYear;
    }

   
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }
}
