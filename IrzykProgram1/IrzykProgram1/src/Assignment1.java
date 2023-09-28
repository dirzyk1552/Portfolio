//1.	Finish the sentence 
    //Relationships between classes are an important part of Object Oriented Programming because of code re-usability. It also provides flexibility through inheritance.
 
//2.	Describe an Association, in general terms.  
 	//An Association is 'has-a" relationship, meaning it establishes a relationship between two classes through their objects.
//3.	List the four types of Associations between two classes. 
 	// The four types of Associations between two classes are One-to-One, One-to-Many, Many-to-One, and Many-to-Many.
//4.	Illustrate each of these relationships by writing a sentence for each one between an Employee class and a Company class.  
 	// One-to-One- There is one Employee for the one Company
	// One-to-Many- One Employee works for Many Companies
	// Many-to-One- There are Many Employees that work at One Company
	// Many-to-Many- There are Many Employees that work at Many Companies.
//5.	These Associations mean that objects from one class can communicate with objects of another class, enabling them to access data.  Describe how a HAS-a relationship is created in OOP. 
 	//A HAS-a relationship is established by declaring the instance of the mother class inside of the child class.
//6.	The two forms of Association are Aggregation and Composition.  Describe both, highlighting the differences. 
 	//Aggregation are when two objects have an "Has-a" relationship. Composition is when both the objects are connected to each other.

//Aggregation example
 class Employee {
	String FirstName;
	String LastName;
	public Employee(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
}

public class Assignment1{
	String Role;
	String EmpNumber;
	Employee employee;
	
	public Assignment1(Employee employee, String Role, String EmpNumber) {
		this.employee = employee;
		this.Role = Role;
		this.EmpNumber = EmpNumber;
	}

	void display() {
		System.out.println("Name: " + employee.FirstName + " " + employee.LastName);
		System.out.println("Position: " + Role + ", Employee Number: " + EmpNumber);
	}

	public static void main(String[] args) {
		Employee Emp1 = new Employee("Dylan","Irzyk");
		Employee Emp2 = new Employee("Joe","Smith");
		
		Assignment1 Me = new Assignment1(Emp1, "Data Analyst", "1045");
		Assignment1 Joe = new Assignment1(Emp2, "Project Coordinator", "85");
		
		Me.display();
		Joe.display();
	}
}
