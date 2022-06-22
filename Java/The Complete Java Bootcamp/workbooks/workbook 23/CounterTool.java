import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nI hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        /*
            Get integers from the user.
                1. print : Pick a number to count by:
                   pick up the user's answer
                2. print : Pick a number to start counting from:
                   pick up the user's answer
                3. print : Pick a number to count to:
                   pick up the user's answer
        */
        System.out.print("\nPick a number to count by: ");
        int countBy = scan.nextInt();


        System.out.print("Pick a number to start counting from: ");
        int countFrom = scan.nextInt();

        System.out.print("Pick a number to count to: ");
        int countTo = scan.nextInt();


        /*
            Create a for loop that:
            1. starts from the second number.
            2. stops at the third number.
            3. counts in steps of the first.
        */
        System.out.println();
        for (int i = countFrom; i <= countTo; i += countBy) {
            if (i == countTo) {
                System.out.println(i);
            } else {
                System.out.print(i + "... ");
            }
        }
        System.out.println();

        scan.close();
    }
}
