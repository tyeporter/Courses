class Integers {
    public static void main(String[] args) {
        // Ints can store numbers ranging from -2,147,483,648 - 2,147,483,647 (32 Bits)
        int population = 254362;
        System.out.println("There are " + population + " people in the town.");

        // Longs can store numbers ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (64 Bits)
        // We have to append an 'L' to the end of a long
        long globalPopulation = 7800000000L;
        System.out.println("There are " + globalPopulation + " people on earth.");

    }
}
