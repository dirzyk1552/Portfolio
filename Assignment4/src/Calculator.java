//Importing different libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
	//text field for amount user wants to input
    private JTextField investmentAmountField;
    //text field for how many years user wants to input
    private JTextField yearsField;
    //text field for how much interest to add
    private JTextField interestRateField;
    //text field to calculate the amount
    private JButton calculateButton;

    public Calculator() {
    	//Title of text box
        setTitle("Future Value Calculator");
        //dimensions of calculator
        setSize(350, 500);
        //closing JFrame when user exits
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //layout of grid
        setLayout(new GridLayout(4, 2));
        //Adding the names of the fields in JFrame
        JLabel investmentLabel = new JLabel("Investment Amount:");
        investmentAmountField = new JTextField();

        JLabel interestRateLabel = new JLabel("Annual Interest Rate (%):");
        interestRateField = new JTextField();

        JLabel yearsLabel = new JLabel("Number of Years:");
        yearsField = new JTextField();

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());
//Adding all of the labels
        add(investmentLabel);
        add(investmentAmountField);
        add(interestRateLabel);
        add(interestRateField);
        add(yearsLabel);
        add(yearsField);
        add(new JLabel()); 
        add(calculateButton);

        setVisible(true);
    }
//Adding ActionListener so that when user clicks button, it works
    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double investmentAmount = Double.parseDouble(investmentAmountField.getText());
                double annualInterestRate = Double.parseDouble(interestRateField.getText()) / 100;
                int years = Integer.parseInt(yearsField.getText());
               //Formula for future value
                double futureValue = calculateFutureValue(investmentAmount, annualInterestRate, years);
                JOptionPane.showMessageDialog(null, "Future Value: " + futureValue);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
            }
        }
    }
//Method to calculate value
    private double calculateFutureValue(double investmentAmount, double annualInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow((1 + annualInterestRate), years);
        return futureValue;
    }
//SwingUtilities to display JFrame
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}
