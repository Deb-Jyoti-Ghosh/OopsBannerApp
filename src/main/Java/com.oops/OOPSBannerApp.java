import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - Use Case 8 (UC8)
 * Stores character patterns in a HashMap and renders a word using a function.
 *
 * @author Deb Jyoti Ghosh
 * @version 8.0
 */
public class OOPSBannerApp {

    private static final int HEIGHT = 7;

    // Build and return the pattern map
    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    // Render any word using the patterns from the map
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < HEIGHT; row++) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toUpperCase(word.charAt(i));
                String[] pattern = patternMap.get(ch);

                // If pattern missing, print blanks instead of crashing
                if (pattern == null) {
                    pattern = new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "};
                }

                sb.append(pattern[row]);

                if (i < word.length() - 1) {
                    sb.append(" "); // spacing between letters
                }
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }
}