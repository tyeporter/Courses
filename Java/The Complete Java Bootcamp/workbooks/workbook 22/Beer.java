public class Beer {
    public static void main(String[] args) {
        // Make a for loop that starts at i = 99, and finishes at i = 1.
        for (int i = 99; i > 0; i--) {
            sing(i);
        }

        System.out.println();
     }

     /** Task 1
      * Function name – sing.
      * @param i (int)
      *
      *
      * Inside the function:
      *  1. print:
      *      <i> bottles of beer on the wall, <i> bottles of beer!
      *      take one down, pass it around, <i-1> bottles of beer on the wall!
      */
    public static void sing(int i) {
        if (i == 1) {
            System.out.println("\n" + i + " bottle of beer on the wall, " + i + " bottle of beer!");
        } else {
            System.out.println("\n" + i + " bottles of beer on the wall, " + i + " bottles of beer!");
        }
        System.out.println("take one down, pass it around, " + (i - 1) + " bottles of beer on the wall!");
    }
}
