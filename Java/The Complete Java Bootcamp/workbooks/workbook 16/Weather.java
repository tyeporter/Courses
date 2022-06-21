
public class Weather {
    public static void main(String[] args) {
        double noon = 77;          // Temperature at noon in fahrenheit.
        double evening = 61;       // Temperature during the evening in fahrenheit
        double midnight = 55;      // Temperature at midnight in fahrenheit

        // Call the printTemperatures function.
        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);
    }

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     *
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * (5.0 / 9.0);
    }


    /**
     * Function name: printTemperatures – prints both temperature values.
     * @param fahrenheit (double)
     *
     * Inside the function:
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> .
     */
    public static void printTemperatures(double fahrenheit) {
        System.out.println("F: " + fahrenheit + "\u00b0");
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit) + "\u00b0");
    }
}
