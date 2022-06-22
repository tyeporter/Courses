public class FizzBuzz {
    public static void main(String[] args) {
        // Make a for loop that counts from 0 to 18.
        /*
             Beside each number:
                  if it's a multiple of three, mark it as Fizz.
                  if it's a multiple of five, mark it as Buzz.
                  if it's a multiple of three and five, mark it as FizzBuzz.
        */
        System.out.println();
        for (int i = 0; i <= 18; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Buzz");
            }
        }
        System.out.println();
     }

}
