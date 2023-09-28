//Faculty class
public class Faculty extends Employee {
    //string for officeHours and rank
    private String officeHours;
    private String rank;

    // Constructor with arguments
    public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
//adding getters and setters
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + " " + officeHours + " " + rank;
    }
}