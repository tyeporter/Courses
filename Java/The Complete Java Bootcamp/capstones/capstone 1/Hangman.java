import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Hangman {
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "/    |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"};

    public static void main(String[] args) {
        System.out.println("\n***********************");
        System.out.println("        HANGMAN        ");
        System.out.println("***********************");
        System.out.println("\nLet's play hangman!");

        // Get random word
        String word = words[getRandomNumber(0, words.length - 1)];

        // Create variable to store guesses (using Set)
        Set<Character> guesses = new HashSet<Character>();
        Set<Character> letters = new HashSet<Character>();

        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }

        // Create a variable to store number of misses
        int misses = 0;

        // Create Scanner
        Scanner scan = new Scanner(System.in);

        // Print board
        printBoard(word, guesses, gallows[misses]);

        // Create game loop
        while(true) {
            // Get guess from user
            System.out.print("\nGuess:\t");
            char guess = scan.nextLine().charAt(0);
            while (guesses.contains(guess)) {
                System.out.print("\nYou guessed that already. Try again:\t");
                guess = scan.nextLine().charAt(0);
            }

            // Add guess to set
            guesses.add(guess);

            // Check for miss
            if (word.contains("" + guess)) {
                letters.remove(guess);
            } else {
                misses++;
            }

            // If user reaches end...
            if (letters.size() == 0) {
                System.out.println("\n" + gallows[misses]);
                System.out.println("You got it!");
                break;
            } else if (misses == gallows.length - 1) {
                System.out.println("\n" + gallows[misses]);
                System.out.println("RIP!");
                break;
            } else {
                // Print board
                printBoard(word, guesses, gallows[misses]);
            }
        }

        System.out.println("The word is: " + word);
        System.out.println();

        // Close scanner
        scan.close();
    }

    /**
     * Prints the board
     * @param word
     * @param guesses
     */

    public static void printBoard(String word, Set<Character> guesses, String gallow) {
        System.out.println("\n" + gallow);

        StringBuilder board = new StringBuilder();
        StringBuilder misses = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (guesses.contains(letter)) {
                board.append(letter);
            } else {
                board.append('_');
            }
        }

        for (Character guess : guesses) {
            if (!word.contains("" + guess)) {
                misses.append(guess);
            }
        }

        System.out.print("Word:\t");
        System.out.println(board.toString());

        System.out.print("Misses:\t");
        System.out.println(misses.toString());
    }

    /**
     * Gets a random number in given range
     * @param min the minimum value for range
     * @param max the maximum value for range
     * @return the generated random number
     */
    public static int getRandomNumber(int min, int max) {
        return  min + (int)(Math.random() * (max - min + 1));
    }
}
