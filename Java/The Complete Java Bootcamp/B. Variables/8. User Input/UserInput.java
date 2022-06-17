// We use the Scanner object to read user input
import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        // We create a new Scanner object by passing it a readable source / input stream
        Scanner scan = new Scanner(System.in);

        // We use the nextLine() method on a Scanner object to read text (String)
        System.out.println("\nWelcome! Thank you for taking the survey.\n");
        System.out.println("What is your name?");

        // We can read the value captured by the Scanner object by assigning it to a variable
        String name = scan.nextLine();

        // We use the nextInt() method to read in an int value
        System.out.println("How many times do you eat out each week?");
        int times = scan.nextInt();

        // We use the nextDouble() method to read in a double value
        System.out.println("How much money do you spend on fast food each week?");
        double amount = scan.nextDouble();

        System.out.println("\nYour weekly expenses on fast food is $" + (times * amount));
        System.out.println("Your monthly expenses on fast food is $" + (times * amount * 4));
        System.out.println("\nThank you for taking our survey " + name + "!\n");

        // We must close the scanner after we use it
        scan.close();
    }
}
