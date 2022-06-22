import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        /* Task
            1. Pick up a username and password from the user.
            2. Set up a loop that keeps running while the username OR password is incorrect.
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            3. After they enter the correct information, print:
                   \nSign in successful. Welcome!
       */

        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        // Get username
        String enteredUsername = scan.nextLine();

        System.out.print("• Password: ");
        // Get password
        String enteredPassword = scan.nextLine();

        while (!enteredUsername.equals(username) || !enteredPassword.equals(password)) {
            System.out.println("\nIncorrect, please try again\n");

            System.out.print("• Username: ");
            enteredUsername = scan.nextLine();

            System.out.print("• Password: ");
            enteredPassword = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!\n");

        // Close scanner
        scan.close();
    }
}
