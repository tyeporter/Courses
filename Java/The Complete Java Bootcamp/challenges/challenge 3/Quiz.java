import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        // Store answer 1
        String answer1 = scan.next();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        // Store answer 2
        String answer2 = scan.next();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        // Store answer 3
        String answer3 = scan.next();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        // Store answer 4
        String answer4 = scan.next();

        int score = 0;

        // Check each answer - For each correct answer, add 5 points to the score.

        if (answer1.equals("c")) {
            score += 5;
        }

        if (answer2.equals("a")) {
            score += 5;
        }

        if (answer3.equals("d")) {
            score += 5;
        }

        if (answer4.equals("a") || answer4.equals("b")) {
            score += 5;
        }

        System.out.println("\nYour final score is: " + score + "/20");

        // Print a message depending on the score

        if (score >= 15) {
            System.out.println("\nWow, you know your stuff!");
        } else if (score >= 5 && score < 15) {
            System.out.println("\nNot bad!");
        } else {
            System.out.println("\nBetter luck next time!");
        }

        scan.close();
    }
}
