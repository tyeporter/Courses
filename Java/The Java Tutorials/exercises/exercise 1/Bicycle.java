
public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        this.cadence = newValue;
    }

    void changeGear(int newValue) {
        this.gear = newValue;
    }

    void speedUp(int increment) {
        this.speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        this.speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
             cadence + " speed:" +
             speed + " gear:" + gear);
    }
}
