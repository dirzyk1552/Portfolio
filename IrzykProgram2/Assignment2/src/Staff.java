//Employee Class
public class Staff extends Employee {
    // A staff member has a title
    private String title;

    // Constructor with arguments
    public Staff(String name, String address, String phoneNumber, String email, String office, int salary, String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }
//getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + " " + title;
    }
}
