public class Student extends Person {
    // Class status constants
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private String status; // Class status of the student

    // Constructor with arguments
    public Student(String name, String address, String phoneNumber, String email, int status) {
        super(name, address, phoneNumber, email);
        setStatus(status);
    }

    // Setter for the class status
    public void setStatus(int status) {
        switch (status) {
            case FRESHMAN:
                this.status = "Freshman";
                break;
            case SOPHOMORE:
                this.status = "Sophomore";
                break;
            case JUNIOR:
                this.status = "Junior";
                break;
            case SENIOR:
                this.status = "Senior";
                break;
            default:
                this.status = "Unknown";
                break;
        }
    }

    // Getter for the class status
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return super.toString() + " " + status;
    }
}
