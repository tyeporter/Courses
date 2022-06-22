
public class Grocer {
    public static void main(String[] args) {

        /* Task 1:
            Create an array that stores each aisle: apples, bananas, candy, chocolate, coffee, tea
        */
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};


        /* Task 2:
            print: "Do you sell coffee?"
        */
        System.out.println("\nDo you sell coffee?");


        /* Task 3:
            Check if Java Grocer sells coffee
        */
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals("coffee")) {
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }
        }
        System.out.println();
    }
}
