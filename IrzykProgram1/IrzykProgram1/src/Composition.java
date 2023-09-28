//Composition example
public class Composition {
	private String FirstName;
	private String LastName;
	private int EmpNumber;
	
	public Composition() {
		this("Dylan", "Irzyk", 1045);
	}
	public Composition(String FirstName, String LastName, int EmpNumber) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.EmpNumber = EmpNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public int getEmpNumber() {
		return EmpNumber;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public void setEmpNumber(int EmpNumber) {
		this.EmpNumber = EmpNumber;
	}
}