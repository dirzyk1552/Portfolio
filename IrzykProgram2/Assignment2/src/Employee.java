import java.util.Date;
//Employee class
public class Employee extends Person {
    // An employee has an office, salary, and date hired.
    private String office;
    private double salary;
    private Date dateHired;

    // Constructor with arguments
    public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date(); // Set the date of hire to the current date
    }
//getters and setters 
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + " " + office + " " + salary;
    }
}
