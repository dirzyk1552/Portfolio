public class Specifications {
//variable for description of each test
    private String description;
//number of the total expectations
    private int totalExpectations;
//number of the total expectations that were met
    private int metExpectations;
//Constructor
    public Specifications(String description) {

        this.description = description;

    }
//Method to add an expectation
    public void expect(boolean condition, String expectation) {
//incrementing the totalExpectations
        totalExpectations++;
//checking if condition is true
        if (condition) {
//incrementing the metExpectations
            metExpectations++;

        } else {
//printing statement if expectation is not met
            System.out.println("Expectation not met: " + expectation);

        }

    }

    public void summarize() {

        System.out.println(description);
//displaying how many expectations were met out of total expectations
        System.out.println("Met Expectations: " + metExpectations + " / " + totalExpectations);

    }

}