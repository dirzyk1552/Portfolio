public class Software extends Item{

//data field for version
private String version;

//Constructor for title, price, and version
public Software(String title, double price, String version) {
super(title, price);
this.version = version;
}

//Getter and Setter Methods
public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}
}