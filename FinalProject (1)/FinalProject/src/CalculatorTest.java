public class CalculatorTest {

    public static void main(String[] args) {

        Specifications addTest = new Specifications("Test Add Operation");

        Calculator calculator = new Calculator();

        
//Creating Tests for addition operation//
     
        addTest.expect(calculator.add(10, 1) == 11, "10 + 1 should equal 11");
//Expecting the result to be 11
        addTest.expect(calculator.add(8, 15) == 23, "8 + 15 should equal 23");
//Expecting the result to be 23
        addTest.expect(calculator.add(5, 2) == 0, "5 + 2 should equal 7");
//Expecting the result to be 7     

        addTest.summarize();

        
//Creating tests for subtraction
        Specifications subtractTest = new Specifications("Test Subtract Operation");

//Expecting the result to be 6
        subtractTest.expect(calculator.subtract(9, 3) == 6, "9 - 3 should equal 6");
//Expecting the result to be 9
        subtractTest.expect(calculator.subtract(14, 5) == 9, "14 - 5 should equal 9");
//Expecting the result to be 3
        subtractTest.expect(calculator.subtract(10, 7) == 0, "10 - 7 should equal 3");


        subtractTest.summarize();

    
    //Test for division
    	Specifications divideTest = new Specifications("Test Divide Operation");

    	//Expecting the result to be 4
    	divideTest.expect(calculator.divide(16, 4) == 4, "16 / 4 should equal 4");
    	//Expecting the result to be 2
    	divideTest.expect(calculator.divide(8, 4) == 2, "8 / 4 should equal 2");
    	//Expecting the result to be 5
    	divideTest.expect(calculator.divide(10, 2) == 0, "10 / 2 should equal 5");

    

    	divideTest.summarize();
    	//Test for multiplication
	
    	Specifications multiplyTest = new Specifications("Test Multiply Operation");

    	//Expecting the result to be 6
    	multiplyTest.expect(calculator.multiply(2, 3) == 6, "2 * 3 should equal 6");
    	//Expecting the result to be 32
    	multiplyTest.expect(calculator.multiply(8, 4) == 32, "8 * 4 should equal 32");
    	//Expecting the result to be 90
    	multiplyTest.expect(calculator.multiply(9, 10) == 0, "9 * 10 should equal 90");

    	multiplyTest.summarize();
    	
	//Test for email validation
    	Specifications specifications = new Specifications("Email Validation Expectations");
    	//Expecting the result to be a validated email
    	EmailValidator EmailValidator = new EmailValidator();
    	specifications.expect(
        EmailValidator.isValid("dirzyk@comcast.com"),
        "Valid email is correctly validated"
        );
    	//Expecting the result to be a invalidated email
        specifications.expect(
            !EmailValidator.isValid("invalid_emaildoesnotwork"),
            "Invalid email is correctly rejected"
        );
      //Expecting the result to be a validated email
        specifications.expect(
                !EmailValidator.isValid("appple11234@gmail.com"),
                "Invalid email is correctly rejected"
            );
   
        specifications.summarize();

    }
}