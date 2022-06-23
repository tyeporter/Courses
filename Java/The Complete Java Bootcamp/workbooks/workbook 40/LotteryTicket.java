import java.util.Arrays;

public class LotteryTicket {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};

        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;

        System.out.print("\nTicket 1 numbers: ");
        printTicketNumbers(ticket);

        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
    }

    /**
     * Function name – printTicketNumbers
     * @param ticket ( int[] )
     *
     * Inside the function:
     *   1.   print the numbers in one line.
     *        i.e  1 4 6 3 2 6
     *   2.   print a new line
     */
    public static void printTicketNumbers(int[] ticket) {
        for (int number : ticket) {
            System.out.print(number + " ");
        }
        System.out.println("\n");
    }
}
