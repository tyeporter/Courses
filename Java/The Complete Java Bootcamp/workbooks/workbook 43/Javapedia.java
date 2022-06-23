import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n********** Javapedia **********");
        System.out.println("How many historical figures will you register?");

        // Task 1
        int count = scan.nextInt();

        // Task 2
        String[][] database = new String[count][3];

        // Task 3
        scan.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("\t - Date of birth: ");
            database[i][1] = scan.nextLine();

            System.out.print("\t - Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.print("\n");
        }

        System.out.println("These are the values you stored:");
        // Task 4
        print2DArray(database);

        System.out.print("\nWho do you want information on? ");

        // Task 5
        String search = scan.nextLine();
        for (int i = 0; i < database.length; i++) {
            if (search.equals(database[i][0])) {
                System.out.println("\n\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }
        System.out.println();

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     *
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value.
     *     • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
