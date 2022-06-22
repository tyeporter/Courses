
public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        /* Task 1:
                Using a for loop:
                - Count Java's wins and store the result in a variable: wins.
                - Count Java's losses and store the result in a variable: losses.
        */
        int wins = 0;
        int losses = 0;

        for (String result : record) {
            if (result.equals("WIN")) {
                wins++;
            } else if (result.equals("LOSS")) {
                losses++;
            }
        }

        /* Task 2:
                Print:
                - "\nWith a professional record of <wins> Wins and <losses> losses."
                - "He is the pride of oracle: Java Fury!"
        */
        System.out.println("\nWith a professional record of " + wins + " wins and " + losses + " losses.");
        System.out.println("He is the pride of Oracle: Java Fury!\n");
    }
}
