import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.passport = new String[3];
        this.seatNumber = seatNumber;
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
        this.seatNumber = source.seatNumber;
    }

    public boolean applyPassport() {
        int random = this.getRandomNumber(0, 1);
        if (random == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void chooseSeat() {
        this.seatNumber = this.getRandomNumber(1, 11);
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    private int getRandomNumber(int min, int max) {
        return min + (int)(Math.random() * (max - min + 1));
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nNationality: " +
            this.nationality + "\nDate of Birth: " +
            this.dateOfBirth + "\nSeat Number: " +
            this.seatNumber + "\nPassport: " +
            Arrays.toString(this.passport);
    }
}
