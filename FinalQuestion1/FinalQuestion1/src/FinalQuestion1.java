import java.util.Scanner;

public class FinalQuestion1 {
	//defining repeatletters string//
    public static String repeatletters(String a) {
    	//if else method to check length of the input string//
        if (a.length() <= 1) {
            return a + a;
        } else {
        	//if the letters are different, it will return two each of those letters//
            if (a.charAt(0) == a.charAt(1)) {
                return a.substring(0, 2) + repeatletters(a.substring(2));
            } else {
                return a.charAt(0) + "" + a.charAt(0) + repeatletters(a.substring(1));
            }
        }
    }
//main method//
    public static void main(String[] args) {
    	//scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        //prints out the letters//
        System.out.println(repeatletters(s));
        scan.close();
    }
}
