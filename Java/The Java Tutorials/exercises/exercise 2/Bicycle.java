
public class Bicycle implements Vehicle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        this.cadence = newValue;
    }

    void changeGear(int newValue) {
        this.gear = newValue;
    }

    public void speedUp(int increment) {
        this.speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        this.speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
             cadence + " speed:" +
             speed + " gear:" + gear);
    }
}
