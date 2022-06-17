import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n**** Welcome to JavaGram! Let's sign you up. ****\n");

        // Task 1 - Using Scanner, ask the user questions

        // Ask for their first name.
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        // Ask for their last name.
        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();

        // Ask: How old are you?
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        // Ask them to make a username. SIDE NOTE:
        // nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
        System.out.println("\nCreate a username");
        String username = scan.nextLine();

        // Ask what city they live in.
        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();

        // Ask what country that's from.
        System.out.println("\nWhat country do you live in?");
        String country = scan.nextLine();

        // Task 2 - Print their information.

        System.out.println("\nThank you for joining JavaGram!");

        System.out.println("\nHere's the information you entered:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
        System.out.println();

        // Close scanner
        scan.close();
    }
}
