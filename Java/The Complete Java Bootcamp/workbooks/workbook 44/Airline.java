
public class Airline {
    private Person[] seats;

    public Airline() {
        this.seats = new Person[11];
    }

    public void createReservation(Person person) {
        while (this.seats[person.getSeatNumber() - 1] != null) {
            System.out.println(person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.");
            person.chooseSeat();
        }

        this.seats[person.getSeatNumber() - 1] = new Person(person);
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".");
    }

    public void setPerson(Person person) {
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }

    public Person getPerson(int index) {
        return new Person(this.seats[index]);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.seats.length; i++) {
            if (this.seats[i] == null) {
                builder.append("Seat " + (i + 1) + " is empty.\n\n");
            } else {
                builder.append(this.seats[i] + "\n\n");
            }
        }

        return builder.toString();
    }
}
