/**
 * OOPS Banner App - Use Case 6 (UC6)
 * Uses static helper methods to generate banner patterns for O, P, S
 * and composes "OOPS" without hardcoding full lines in main.
 *
 * @author Deb Jyoti Ghosh
 * @version 6.0
 */
public class OOPSBannerApp {

    private static String[] getO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    private static String[] getP() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    private static String[] getS() {
        return new String[] {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        String[] banner = new String[7];
        for (int i = 0; i < banner.length; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}