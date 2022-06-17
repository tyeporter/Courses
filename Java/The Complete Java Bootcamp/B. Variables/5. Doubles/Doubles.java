class Doubles {
    public static void main(String[] args) {
        // Doubles store floating-point numbers ranging from
        // 1.7976931348623157 x 10^308 to 4.9406564584124654 x 10-324 (64 bits)
        double percentage = 55.7;
        System.out.println("In 2020, " + percentage + "% of the worlds population is urban.");

        // Assigning a integer to a double will automatically convert the integer to a decimal
        double dividend = 25;
        System.out.println(dividend);

        // Doing division between doubles will result in a decimal
        double divisor = 2;
        System.out.println(dividend / divisor);

        // Division between integers will always result in an integer (removes decimal)
        int top = 25;
        int bottom = 2;
        System.out.println(top / bottom);
    }
}
