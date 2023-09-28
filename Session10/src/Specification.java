import java.util.ArrayList;
import java.util.List;
//Specification class
class Specification {
	//declaring private variables to store
    private String subject;
    private List<Example> examples;
//Constructor
    public Specification(String subject) {
        this.subject = subject;
        //creating arraylist to store
        this.examples = new ArrayList<>();
    }
//Method to create example of specification
    public void example(String description, Runnable exampleBlock) {
        Example example = new Example(description, exampleBlock);
        examples.add(example);
    }
//method to execute this example of specification
    public void run() {
        System.out.println("Subject: " + subject);
        for (Example example : examples) {
            example.run();
        }
    }
}
//Example class
class Example {
    private String description;
    private Runnable exampleBlock;

    public Example(String description, Runnable exampleBlock) {
        this.description = description;
        this.exampleBlock = exampleBlock;
    }

    public void run() {
    	//printing example 
        System.out.print("Example: " + description + " - ");
        exampleBlock.run();
    }
}
//Expectation class
class Expectation {
	//Static method to compare expected and actual object
    public static void expect(Object actual, Object expected) {
        if (actual.equals(expected)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
