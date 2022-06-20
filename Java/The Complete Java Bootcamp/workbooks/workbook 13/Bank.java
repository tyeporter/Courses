import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");

        // Get the user's decision.
        String decision = scan.nextLine();

        if (decision.equals("yes")) {
            System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");
            // Get savings and credit card debt
            double savings = scan.nextDouble();
            double debt = scan.nextDouble();


            System.out.println("\nHow many years have you worked for?");
            // Get number of years
            int years = scan.nextInt();


            System.out.println("\nWhat is your name?");
            // Get the user's name
            scan.nextLine();
            String name = scan.nextLine();


            // Approve the mortgage if they meet the requirements (see article)
            // Otherwise, don't give them a mortgage.
            if (savings >= 10000 && debt < 5000 && years > 2) {
                System.out.println("\nCongratulations " + name + " You have been approved!");
            } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
            }
        } else if (decision.equals("no")) {
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}
