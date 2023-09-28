import java.util.Scanner;

public class Main {
    static IBag<String> bag;
    
    public static void main(String[] args) {
        run();
    }
    
    public static void run() {
    	//Creating new scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Which type of bag do you want? sorted/unsorted");
        String bagType = sc.nextLine();
        
        // Check which bag type the user chooses and initializes that bag.
        if (bagType.equalsIgnoreCase("sorted")) {
            bag = new SortedBag<String>();
        } else if (bagType.equalsIgnoreCase("unsorted")) {
            bag = new UnsortedBag<String>();
        } else {
            // If none of the above options is chosen
            System.out.println("Please make an appropriate choice");
            System.exit(0);
        }
        //Creating prompt for user to answer
        System.out.println("How many items do you want to put in the bag?");
        int numOfItems = Integer.valueOf(sc.nextLine());
        
        for (int i = 1; i <= numOfItems; i++) {
            System.out.println("Enter Item " + i + ":");
            String item = sc.nextLine();
            bag.add(item);
        }
        
        // Check for an item in the bag.
        System.out.println("You can check if something is in the bag.");
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Check for (type 'done' to stop):");
            String chkItem = sc.nextLine();
            if (chkItem.equalsIgnoreCase("done")) {
                isTrue = false;
                break;
            } else {
            	//Checking to see if the item is in the bag
                if (bag.contains(chkItem)) {
                    System.out.println("Yes, it's in the bag.");
                } else {
                    System.out.println("No, it's not in the bag.");
                }
            }
        }
        
        // Removing items one by one from the bag.
        System.out.println("Let's remove items from the bag.");
        int i = 0;
        while (i < numOfItems) {
            System.out.println("Removing item: " + bag.remove());
            i++;
        }
        //Closing the scanner
        sc.close();
    }
}