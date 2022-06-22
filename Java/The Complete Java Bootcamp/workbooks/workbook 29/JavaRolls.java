import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Task 1:
            1. print: Let's play Rolling Java. Type anything to start.
            2. Get the user to enter any value
        */

        System.out.println("\nLet's play Rolling Java. Type anything to start.\n");
        scan.nextLine();

        /* Task 2:
            1. Once the user is ready, print:
                Great, here are the rules:\n
                    - If you roll a 6 the game stops.
                    - If you roll a 4 nothing happens.
                    - Otherwise, you get 1 point.\n
                You must collect at least 3 points to win. Enter anything to roll:
            2. Get the user to enter any value
        */

        System.out.println("\nGreat here are the rules:\n\t- If you roll a 6 the game stops.\n\t- If you roll a 4 nothing happens.\n\t- Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");

        int score = 0;

       /*
          Task 3:
            1. Make a while loop that runs forever
            2. During each run, get them to enter a random value


          Task 5:
            1. During each run, call the rollDice() function.
            2. Print each dice roll like so: You rolled a <diceRoll>.


          Task 6:
            If the user rolls a 6:
                1. print: End of game.
                2. stop the game.
            If the user rolls a 4:
                1. print: Zero points. Keep rolling.
            If the user rolls anything else:
                1. update the points variable by 1
                2. print: One point. Keep rolling.
        */

        while (true) {
            // Wait for user input
            scan.nextLine();

            // Roll die
            int roll = rollDice();

            // Print result
            System.out.println("\nYou rolled: " + roll);

            if (roll == 6) {
                break;
            } else if (roll != 4) {
                System.out.println("Zero points. Keep rolling!");
            } else {
                score += 1;
                System.out.println("One point. Keep rolling!");
            }
        }

        /* Task 7:
            1. After the game ends, check the user's points.
                    System.out.println("\nYour score is: " + score);
            2. If the score is greater than or equal to 3, print:
                    Wow, that's lucky. You win!
               Otherwise, print:
                    Tough luck, you lose :(
        */

        if (score >= 3) {
            System.out.println("\nWow, that's lucky. You win!\n");
        } else {
            System.out.println("\nTouch luck, you lose :(\n");
        }

        // Close scanner
        scan.close();
    }


    /** Task 4
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     *
     */
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}
