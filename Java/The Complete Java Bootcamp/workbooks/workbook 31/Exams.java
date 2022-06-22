
public class Exams {
    public static void main(String[] args) {
        System.out.println("\nIt's time to take your 5th year exams. Please, take your seats.\n");

        /* Task 1:
            Create an array that stores 5 students: "Harry", "Neville", "Ron", "Hermione", "Seamus"
        */
        String[] students = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};

        /* Task 2:
            Assign each student a seat according to their index in the array.
        */
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", you will take seat " + i + ".");
        }
        System.out.println();
    }
}
