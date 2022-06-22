import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n-------------------");
        System.out.println("**** BLACKJACK ****");
        System.out.println("-------------------\n");
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("...Ready? Press anything to begin!");
        scan.nextLine();


        /* Task 3:
            Get two random cards
        */
        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        System.out.println("\nYou get: ");
        System.out.println(cardString(card1));
        System.out.println("and");
        System.out.println(cardString(card2));


        /* Task 4:
            Print the sum of your hand value.
        */
        int total = Math.min(card1, 10) + Math.min(card2, 10);
        System.out.println("\nYour total is: " + total);


        /* Task 5:
            Get two random cards for the dealer.
        */
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);
        System.out.println("\nThe dealer shows:");
        System.out.println(cardString(dealerCard1));
        System.out.println("and has a card facing down");
        System.out.println(faceDown());
        System.out.println("\nThe dealer's total is hidden.");


        /* Task 7:
            Keep asking the player to hit or stay (while loop).
        */
        while (true) {
            // Get choice
            String choice = hitOrStay();

            // Break if choice is "stay"
            if (choice.equals("stay")) {
                break;
            }

            // Draw new card
            int card = drawRandomCard();
            total += Math.min(card, 10);

            // Print card
            System.out.println("\nYou get a:");
            System.out.println(cardString(card));

            // Print total
            System.out.println("\nYour new total is: " + total);

            // If total is greater than 21...
            if (total > 21) {
                System.out.println("\nBust! You lose :(\n");
                System.exit(0);
            }
        }


        /* Task 8:
            Print dealers turn
        */
        System.out.println("\nDealer's turn.");
        System.out.println("The dealer's cards are:");
        System.out.println(cardString(dealerCard1));
        System.out.println("and");
        System.out.println(cardString(dealerCard2));
        System.out.println("\nThe dealer's total is: " + dealerTotal);


        /* Task 9:
            Dealer keeps hitting until their total gets to 17
        */
        while (dealerTotal < 17) {
            int card = drawRandomCard();
            dealerTotal += Math.min(card, 10);

            System.out.println("\nDealer get a:");
            System.out.println(cardString(card));
            System.out.println("\nThe dealer's total is: " + dealerTotal);
        }


        /* Task 10
            Check for dealer bust
        */
        if (dealerTotal > 21) {
            System.out.println("\nDealer bust! You win!\n");
            System.exit(0);
        }


        /* Task 11
            Compare dealer and player hand values and check winner
        */
        if (total > dealerTotal) {
            System.out.println("\nYou win!");
        } else {
            System.out.println("\nDealer wins!");
        }
        System.out.println();

        // Close scanner
        scan.close();

    }

    /** Task 1:
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        return 1 + (int)(Math.random() * (13 - 1 + 1));
    }

    /** Task 2:
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber) {
        switch(cardNumber) {
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

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }

    /** Task 6: – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option
     */
    public static String hitOrStay() {
        System.out.print("\nWould you like to hit or stay?: ");
        String answer = scan.nextLine();

        while (!(answer.equals("hit") | answer.equals("stay"))) {
            System.out.print("Try again! (hit or stay): ");
            answer = scan.nextLine();
        }

        return answer;
    }
}
