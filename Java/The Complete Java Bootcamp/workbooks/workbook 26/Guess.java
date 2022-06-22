import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        /* Task
             1. Store a "secret" number between 1 and 5.
             2. Then, prompt the user to enter a guess.
             3. Set up a loop that keeps running while the user is incorrect
                Every time they get it wrong, write 'Guess again: '
             4. Once they guess it, print: You got it!
        */

        int secret = (int)(Math.random() * 6);
        System.out.print("\nI chose a number between 1 and 5. Try to guess it: ");

        Scanner scan = new Scanner(System.in);

        while (scan.nextInt() != secret) {
            System.out.print("Guess again: ");
        }

        System.out.println("\nYou got it!\n");

        // Close scanner
        scan.close();
     }
}
