package src.main.models;

import java.util.Arrays;

public class Team {
    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

    public Team(String house, String keeper, String seeker, String[] chasers) {
        if (house == null || house.isEmpty()) {
            throw new IllegalArgumentException("House cannot be null/blank");
        }

        if (keeper == null || keeper.isEmpty()) {
            throw new IllegalArgumentException("Keeper cannot be null/blank");
        }

        if (seeker == null || seeker.isEmpty()) {
            throw new IllegalArgumentException("Seeker cannot be null/empty");
        }

        if (this.hasNull(chasers) || this.hasNull(chasers)) {
            throw new IllegalArgumentException("Chasers cannot have null/blank");
        }

        if (chasers.length != 3) {
            throw new IllegalArgumentException("Threre must be 3 chasers");
        }
        this.house = house;
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public Team(Team source) {
        this.house = source.house;
        this.keeper = source.keeper;
        this.seeker = source.seeker;
        this.chasers = Arrays.copyOf(source.getChasers(), source.getChasers().length);
    }

    public void setHouse(String house) {
        checkParam(house, "House");
        this.house = house;
    }

    public void setKeeper(String keeper) {
        checkParam(keeper, "Keeper");
        this.keeper = keeper;
    }

    public void setSeeker(String seeker) {
        checkParam(seeker, "Seeker");
        this.seeker = seeker;
    }

    public void setChasers(String[] chasers) {
        if (this.hasNull(chasers) || this.hasNull(chasers)) {
            throw new IllegalArgumentException("Chasers cannot have null/blank");
        }
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public String getHouse() {
        return house;
    }

    public String getKeeper() {
        return keeper;
    }

    public String getSeeker() {
        return seeker;
    }

    public String[] getChasers() {
        return Arrays.copyOf(this.chasers, this.chasers.length);
    }

    public static String getPositionChaser() {
        return POSITION_CHASER;
    }

    public static String getPositionSeeker() {
        return POSITION_SEEKER;
    }

    public static String getPositionKeeper() {
        return POSITION_KEEPER;
    }

    public boolean hasNull(String[] array) {
        return Arrays.stream(array)
                    .anyMatch(chaser -> chaser == null);
    }

    public boolean hasBlank(String[] array) {
        return Arrays.stream(array)
                    .anyMatch(chaser -> chaser.isBlank());
    }

    private void checkParam(String value, String param) {
        if (param == null || param.isEmpty()) {
            throw new IllegalArgumentException(param + "");
        }
    }

    @Override
    public String toString() {
        return "House: " + this.house + "\n" +
            "Keeper: " + this.keeper + "\n" +
            "Seeker: "  + this.seeker + "\n" +
            "Chasers: " + Arrays.toString(this.chasers) + "\n";
    }
}
