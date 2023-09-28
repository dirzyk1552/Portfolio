import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    private static final String EMAIL_PATTERN =
    		//Regular expression for what's valid in the email
        "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
//creating variable to hold the compiled pattern
    private final Pattern pattern;
//Constructor to initialize the pattern with the email pattern
    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
//method to check if email submitted is valid
    public boolean isValid(String email) {
    	//Create a matcher by applying the pattern to the email
        Matcher matcher = pattern.matcher(email);
        //return matcher
        return matcher.matches();
    }
}
