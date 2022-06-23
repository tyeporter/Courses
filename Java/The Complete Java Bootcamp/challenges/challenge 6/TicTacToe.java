import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n***********************");
        System.out.println("      TIC-TAC-TOE      ");
        System.out.println("***********************");
        System.out.println("\nLet's play tic tac toe!");

        // Task 1
        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };

        // Task 2
        printBoard(board);

        // Task 3
        int turnsLeft = 9;
        int result = 0;
        char playerTurn =  'X';
        while (true) {
            System.out.println("Turn: " + playerTurn);

            // Task 4
            int[] choice = askUser(board);

            // Task 5
            board[choice[0]][choice[1]] = playerTurn;
            playerTurn = (playerTurn == 'X') ? 'O' : 'X';
            printBoard(board);

            // Task 6
            result = checkWin(board);
            turnsLeft -= 1;
            if (result == -1) {
                System.out.println("\nPlayer O wins!");
                break;
            } else if (result == 1) {
                System.out.println("\nPlayer X wins!");
                break;
            } else if (turnsLeft == 0) {
                break;
            }
        }

        if (result == 0) {
            System.out.println("\nIt's a tie!");
        }

        System.out.println();

        scan.close();
    }


    /** Task 2
     * Function name - printBoard()
     * @param board (char[][])
     *
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines.
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */
    public static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    /** Task 4
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     *
     * Inside the function
     *   1. Asks the user: - pick a row and column number:
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     *
     */
    public static int[] askUser(char[][] board) {
        System.out.print("\nPick a row and column number (separated by a space): ");
        int row = scan.nextInt();
        int col = scan.nextInt();

        while (board[row][col] != '_') {
            System.out.print("\n\nThat spot is taken. Please enter a different row and column: ");
            row = scan.nextInt();
            col = scan.nextInt();
        }

        int[] spot = {row, col};

        return spot;
    }

    /** Task 6
     * Function name - checkWin
     * @param board (char[][])
     * @return count (int)
     *
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(char[][] board) {
        int xCounter = 0;
        int oCounter = 0;

        // Check rows
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') xCounter++;
                else if (board[i][j] == 'O') oCounter++;
            }
            if (xCounter == 3) return 1;
            if (oCounter == 3) return -1;

            xCounter = 0;
            oCounter = 0;
        }


        // Check columns
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') xCounter++;
                else if (board[j][i] == 'O') oCounter++;
            }
            if (xCounter == 3) return 1;
            if (oCounter == 3) return -1;

            xCounter = 0;
            oCounter = 0;
        }


        // Check diagonals
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') xCounter++;
            else if (board[i][i] == 'O') oCounter++;
        }
        if (xCounter == 3) return 1;
        if (oCounter == 3) return -1;

        xCounter = 0;
        oCounter = 0;

        for (int i = 0; i < board.length; i++) {
            if (board[(board.length - 1) - i][i] == 'X') xCounter++;
            else if (board[(board.length - 1) - i][i] == 'O') oCounter++;
        }
        if (xCounter == 3) return 1;
        if (oCounter == 3) return -1;

        return 0;
    }
}
