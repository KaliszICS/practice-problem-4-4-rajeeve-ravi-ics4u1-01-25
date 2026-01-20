/**
 * The type Practice problem.
 */
public class PracticeProblem {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[]) {
    }

    /**
     * Q 1.
     */
    public static void q1() {
        //Write question 1 code here
    }

    /**
     * Q 2.
     */
    public static void q2() {
        //Write question 2 code here
    }

    /**
     * Q 3.
     */
    public static void q3() {
        //Write question 3 code here
    }

    /**
     * Q 4.
     */
    public static void q4() {
        //Write question 4 code here
    }

    /**
     * Q 5.
     */
    public static void q5() {
        //Write question 5 code here
    }

}

/**
 * The type Campbell class.
 */
class CampbellClass {

    // Private constructor to satisfy the "testClassIsUtility" requirement
    private CampbellClass() {}

    // --- convertString Methods ---

    /**
     * Convert string string.
     *
     * @param val the val
     * @return the string
     */
    public static String convertString(int val) {
        return String.valueOf(val);
    }

    /**
     * Convert string string.
     *
     * @param val the val
     * @return the string
     */
    public static String convertString(double val) {
        return String.valueOf(val);
    }

    /**
     * Convert string string.
     *
     * @param val the val
     * @return the string
     */
    public static String convertString(char val) {
        return String.valueOf(val);
    }

    /**
     * Convert string string.
     *
     * @param val the val
     * @return the string
     */
    public static String convertString(boolean val) {
        return String.valueOf(val);
    }

    // --- convertMetersToCenti Methods ---

    /**
     * Convert meters to centi int.
     *
     * @param meters the meters
     * @return the int
     */
    public static int convertMetersToCenti(int meters) {
        return meters * 100;
    }

    /**
     * Convert meters to centi double.
     *
     * @param meters the meters
     * @return the double
     */
    public static double convertMetersToCenti(double meters) {
        return meters * 100.0;
    }

    // --- removeNonAlpha Methods ---

    /**
     * Remove non alpha string.
     *
     * @param str the str
     * @return the string
     */
    public static String removeNonAlpha(String str) {
        if (str == null) {
            return "";
        }
        // Regex [^a-zA-Z] removes all non-letter characters
        return str.replaceAll("[^a-zA-Z]", "");
    }

    /**
     * Remove non alpha string.
     *
     * @param str     the str
     * @param toUpper the to upper
     * @return the string
     */
    public static String removeNonAlpha(String str, boolean toUpper) {
        String cleaned = removeNonAlpha(str);
        if (toUpper) {
            return cleaned.toUpperCase();
        } else {
            return cleaned.toLowerCase();
        }
    }
}
