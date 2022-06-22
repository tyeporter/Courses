import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            Choose a number
                - Ask: Hi Timmy! Choose a number to count to:
                - Make sure Timmy can enter the value BESIDE the question.
        */

        System.out.print("Hi Timmy! Choose a number to count to: ");
        int number = scan.nextInt();

        /*
            Count from 0 to that number
                - Let's say Timmy entered 5, you would display: 0 1 2 3 4 5
        */

        System.out.println();
        for (int i = 0; i <= number; i++) {
            if (i == number) {
                System.out.println(i);
            } else {
                System.out.print(i + "... ");
            }
        }
        System.out.println("\n");

        scan.close();
    }
}
