public class Main {
	//Main Method
    public static void main(String[] args) {
    	//new specification object 
        Specification spec = new Specification("Arithmetic Expressions");
//Addition example with expected result as fail
        spec.example("Addition", () -> {
            int result = 3 + 4;
            Expectation.expect(result, 9);
        });
//Subtraction example with expected result as fail
        spec.example("Subtraction", () -> {
            int result = 8 - 2;
            Expectation.expect(result, 10);
        });
//Multiplication example with expected result as pass
        spec.example("Multiplication", () -> {
            int result = 2 * 3;
            Expectation.expect(result, 6);
        });
//Division example with expected result as pass
        spec.example("Division", () -> {
            int result = 10 / 2;
            Expectation.expect(result, 5);
        });

        spec.run();
    }
}
