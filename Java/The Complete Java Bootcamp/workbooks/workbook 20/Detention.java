import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHi Bart. I can write lines for you.\nWhat do you want me to write?\n");

        // Scan for the nextLine(), and print it 99 times.
        String line = scan.nextLine();

        System.out.println();
        for (int i = 0; i < 99; i++) {
            System.out.println((i + 1) + ". " + line);
        }
        System.out.println();

        // Close scanner
        scan.close();
    }
}
