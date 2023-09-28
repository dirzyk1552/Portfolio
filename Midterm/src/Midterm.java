import java.io.*;

public class Midterm {
    public static void main(String[] args) {
//Creating new file and name of file
        File file = new File("FacultySalaries.txt");
//creating printwriter so that the data turns into a .txt file
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = generateRandomRank();
                double salary = generateRandomSalary(rank);
//Creating output format for each line
                String line = firstName + " " + lastName + " " + rank + " " + String.format("%.2f", salary);
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Data file created.");
    }
//Creating the assistant, associate, and full strings
    private static String generateRandomRank() {
        String[] ranks = {"assistant", "associate", "full"};
//Creating the rng generator for the ranks.
        int randomIndex = (int) (Math.random() * ranks.length);
        return ranks[randomIndex];
    }

    private static double generateRandomSalary(String rank) {
        double minSalary, maxSalary;
        switch (rank) {
//Creating threshold for the assistant title for money earned
            case "assistant":
                minSalary = 50000.00;
                maxSalary = 70000.00;
                break;
//Creating threshold for the associate title for money earned
            case "associate":
                minSalary = 60000.00;
                maxSalary = 100000.00;
                break;
//Creating threshold for the full title for money earned
            case "full":
                minSalary = 75000.00;
                maxSalary = 120000.00;
                break;
            default:
                throw new IllegalArgumentException("Rank is not valid: " + rank);
        }
//Creating the random amount of money generated for each rank.
        return minSalary + Math.random() * (maxSalary - minSalary);
    }
}

