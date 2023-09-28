//Importing different libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//Making Gui Window
public class Problem2 extends JFrame {
	//Declaring list to display people's names
    private JList<People> peopleList;
    //Declaring listmodel to store people's names
    private DefaultListModel<People> listModel;
    //Declaring label so when user clicks name it displays
    private JLabel nameLabel;
    
    public Problem2() {
    	//Name of window title
        setTitle("People List App");
        //dimensions of window
        setSize(300, 500);
        //closing JFrame when user exits out
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating people included on the list
        ArrayList<People> people = new ArrayList<>();
        people.add(new People("Washington", "George"));
        people.add(new People("Grande", "Ariana"));
        people.add(new People("Jordan", "Michael"));

        // Create a DefaultListModel to hold the People objects
        listModel = new DefaultListModel<>();
        for (People person : people) {
        	//adding each person to the list
            listModel.addElement(person);
        }

        // Create the JList and set its model
        peopleList = new JList<>(listModel);
        //list selection model to make sure user can only select one thing
        peopleList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //adding a selectionlistener to the list
        peopleList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                People selectedPeople = peopleList.getSelectedValue();
                //checking if person is selected
                if (selectedPeople != null) {
                	//updating label at the bottom to person user selected
                    nameLabel.setText("Selected Person: " + selectedPeople.getFullName());
                }
            }
        });

        // Create the label to display the selected person's name
        nameLabel = new JLabel("Selected Person: ");

        // setting to border layout
        setLayout(new BorderLayout());
        //centering the list
        add(new JScrollPane(peopleList), BorderLayout.CENTER);
        //setting label to be at the bottom of the window
        add(nameLabel, BorderLayout.SOUTH);
//making the window visible to the user
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Problem2());
    }
}
//People class
class People {
	//Declaring two strings
    private String firstName;
    private String lastName;
//Constructor for People
    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
//Method to return full name of person
    public String getFullName() {
        return firstName + " " + lastName;
    }

    //method to return full name
    public String toString() {
        return getFullName();
    }
}
