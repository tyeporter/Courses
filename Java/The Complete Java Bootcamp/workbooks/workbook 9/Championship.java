
public class Championship {
    public static void main(String[] args) {
        int gryffindor = 400;   // Gryffindor points
        int ravenclaw = 200;    // Ravenclaw points

        // amount of points by which Gryffindor scored over Ravenclaw
        int margin = gryffindor - ravenclaw;

        // If Gryffindor wins by a margin of 300 points:
        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        }

        // If Gryffindor wins by a margin of any points:
        if (margin > 0) {
            System.out.println("In second place, Gryffindor!");
        }

        // If Gryffindor loses by a margin of 100 points, they are third:
        if (margin < 0 && margin >= -100) {
            System.out.println("In third place, Gryffindor!");
        }

        if (margin < -100) {
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}
