public class HighScore {
    public static void main(String[] args) {

        /* Task 2:
                1. Create an array that stores 10 random numbers
                2. Using a for loop, print the array elements on the same line.
         */

        int[] scores = new int[10];

        System.out.print("\nHere are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] =  randomNumber();
            System.out.print(scores[i] + " ");
        }

        int highScore = 0;

         /* Task 3
                1. Using a for loop, find the highest score in the array and update the highScore.
                2. println("\n\nThe highest score is: <>. Give that man a cookie!");
          */

        for (int score : scores) {
            if (score > highScore) {
                highScore = score;
            }
        }

        System.out.println("\nThe highest score is: " + highScore + ". Give that man a cookie!\n");
    }

    /** Task 1:
     * Function name – randomNumber
     * @return random number (int)
     *
     * Inside the function
     *  - returns a random number between 0 and 50000
     */
    public static int randomNumber() {
        return (int)(Math.random() * (50000 + 1));
    }


}
