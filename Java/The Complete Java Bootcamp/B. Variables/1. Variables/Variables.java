
class Variables {
    public static void main(String[] args) {
        // Declaring and initializing a variable
        int people = 2;

        // Variable names should be lower-camelCase
        int loginAttempts = 0;

        // We can print the value of a variable
        System.out.println(people);

        // Variables are strongly-typed in Java
        // int thisWillBeAnError = "Some string";  // Error: Type Mismatch

        // Setting a variable to the value of another variable
        int tickets = people;
        System.out.println(tickets);

        // Updating a variable
        tickets = 4;
        System.out.println(tickets);

        // Incrementing a number
        tickets += 5;
        System.out.println(tickets);

        // Decrementing a number
        tickets -= 3;
        System.out.println(tickets);
    }
}
