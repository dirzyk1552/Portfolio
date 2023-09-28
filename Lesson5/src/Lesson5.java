import java.util.regex.Pattern;

public class Lesson5 {
    public static void main(String[] args) {
        // Creating the regular expressions
    	//Regular expression for exactly 8 alphanumeric characters
        String pattern1 = "([A-Z]{5})(\\^)(\\d{0,5})?";
        //Regular expression for inputs that begin with zyz and end with zz
        String pattern2 = "[zyz].*zz$";
        //Regular expression for finding specific names in a body of text
        String pattern3 = "[\\p{L} ,.'-]+$";

        // Test cases for input string of exactly 8 alphanumeric characters
        System.out.println("++++++++++++++++++++++");
        System.out.println(Pattern.matches(pattern1, "ABCDE^"));
        System.out.println(Pattern.matches(pattern1, "APLKS^12345"));
        System.out.println(Pattern.matches(pattern1, "ABCDE^^"));
        System.out.println(Pattern.matches(pattern1, "LOPSA^12345ANE"));

        // Test cases for input that begins with zyz and ends with zz
        System.out.println("++++++++++++++++++++++");
        System.out.println(Pattern.matches(pattern2, "zyzzz"));
        System.out.println(Pattern.matches(pattern2, "zzyzzz"));
        System.out.println(Pattern.matches(pattern2, "zyyyzzyzyyzyzzzyyyzz"));
        System.out.println(Pattern.matches(pattern2, "zzyyyzzyyzzyyy"));
        System.out.println(Pattern.matches(pattern2, "zyyzzzyzzyyzzy"));
        System.out.println(Pattern.matches(pattern2, "zzzyz"));

        // Test cases for input that finds these names in a large block of text
        System.out.println("++++++++++++++++++++++");
        System.out.println(Pattern.matches(pattern3, "Abraham Lincoln"));
        System.out.println(Pattern.matches(pattern3, "H. G. Wells"));
        System.out.println(Pattern.matches(pattern3, "Hunter S. Thompson"));
        System.out.println(Pattern.matches(pattern3, "Martin Luther King, Jr."));
    }
}
