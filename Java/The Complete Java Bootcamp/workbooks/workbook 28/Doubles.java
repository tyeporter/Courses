
public class Doubles {
    public static void main(String[] args) {

        /* Task
            1. Call the rollDice() function twice.
            2. Store the return values in dice1 and dice2.
            3. Set up a loop that keeps running while the two dice aren't the same.
            4. During each run, re-roll the dice and print the two values.
            5. After they roll doubles, print: You rolled doubles!
        */

        // Roll dice
        int dice1 = rollDice();
        int dice2 = rollDice();

        // Print results
        System.out.println("\nDice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        while (dice1 != dice2) {
            // Roll dice
            dice1 = rollDice();
            dice2 = rollDice();

            // Print results
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");
        }

        System.out.println("\nYou rolled doubles!\n");
    }


    /** Task 1
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     *
     */
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}
