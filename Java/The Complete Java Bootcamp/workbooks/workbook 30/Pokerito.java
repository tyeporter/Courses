import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /* Task 2:
            Explain the rules
        */
        System.out.println("\n------------------");
        System.out.println("**** POKERITO ****");
        System.out.println("------------------\n");
        System.out.println("Let's play Pokerito! Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("\nThere are two players, you and the computer");
        System.out.println("The dealer will give each player one card.");
        System.out.println("Then, the dealer will draw five cards (the river).");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!");
        System.out.println("\nReady? Type anything if you are.");
        scan.nextLine();


        /* Task 3:
            Present the user with a card
        */

        String userCard = randomCard();
        String computerCard = randomCard();

        System.out.println("\nHere's your card:");
        System.out.println(userCard);
        System.out.println("Here's the computer's card:");
        System.out.println(computerCard);

        int userMatches = 0;
        int computerMatches = 0;


        /* Task 4:
            Draw five cards
        */

        System.out.println("\nNow, the dealer will draw five cards. Press enter to continue.");

        for (int i = 0; i < 5; i++) {
            scan.nextLine();

            // Draw random card
            String draw = randomCard();


            // Check for user match
            if (draw.equals(userCard)) {
                userMatches++;
            }

            // Check for computer match
            if (draw.equals(computerCard)) {
                computerMatches++;
            }

            System.out.println("Card " + (i + 1) + ": \n");
            System.out.println(draw);
        }


        /* Task 5:
            Get the winner
        */

        System.out.println("\nYour number of matches: " + userMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (userMatches > computerMatches) {
            System.out.println("\nYou win!");
        } else if (computerMatches > userMatches) {
            System.out.println("\nComputer wins!");
        } else {
            System.out.println("\nIt's a tie!");
        }
        System.out.println();

        // Close scanner
        scan.close();
    }

    /** Task 1:
     * Function name – randomCard
     * @return (String)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card that matches the random number (get the String values from cards.text).
     */
    public static String randomCard() {
        int randomNumber = getRandomNumber(1, 13);

        switch(randomNumber) {
            case 1:
                return "   _____\n"+
                    "  |A _  |\n"+
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
            case 2:
                return "   _____\n"+
                    "  |2    |\n"+
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
            case 3:
                return "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
            case 4:
                return "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";
            case 5:
                return "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            case 6:
                return "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
            case 7:
                return "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8:
                return "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
                return "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10:
                return "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
                return "   _____\n" +
                    "  |J  ww|\n"+
                    "  | o {)|\n"+
                    "  |o o% |\n"+
                    "  | | % |\n"+
                    "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                    "  |Q  ww|\n"+
                    "  | o {(|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                    "  |K  WW|\n"+
                    "  | o {)|\n"+
                    "  |o o%%|\n"+
                    "  | |%%%|\n"+
                    "  |_%%%>|\n";
            default: return "Something went wrong";
        }

    }

    public static int getRandomNumber(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }
}
