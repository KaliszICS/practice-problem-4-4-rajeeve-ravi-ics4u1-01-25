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
