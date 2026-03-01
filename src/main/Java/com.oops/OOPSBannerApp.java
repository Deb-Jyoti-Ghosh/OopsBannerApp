/**
 * OOPS Banner App - Use Case 7 (UC7)
 * Stores character banner patterns in a class and retrieves them via a map-like structure.
 *
 * @author Deb Jyoti Ghosh
 * @version 7.0
 */
public class OOPSBannerApp {

    // Holds one character and its 7-line banner pattern
    static class CharacterPattern {
        private final char character;
        private final String[] pattern; // must be 7 lines

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        char getCharacter() {
            return character;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    // Central storage for patterns (like a mini pattern library)
    static class CharacterPatternMap {
        private static final CharacterPattern[] PATTERNS = new CharacterPattern[] {
                new CharacterPattern('O', new String[] {
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),
                new CharacterPattern('P', new String[] {
                        " ***** ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        "*      ",
                        "*      ",
                        "*      "
                }),
                new CharacterPattern('S', new String[] {
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                })
        };

        static String[] getPattern(char ch) {
            char upper = Character.toUpperCase(ch);
            for (CharacterPattern cp : PATTERNS) {
                if (cp.getCharacter() == upper) {
                    return cp.getPattern();
                }
            }
            // If character not found, return blank 7 lines to avoid crash
            return new String[] {"       ", "       ", "       ", "       ", "       ", "       ", "       "};
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 7;

        for (int row = 0; row < height; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                String[] pattern = CharacterPatternMap.getPattern(word.charAt(i));
                lineBuilder.append(pattern[row]);

                // space between letters (not after last one)
                if (i < word.length() - 1) {
                    lineBuilder.append(" ");
                }
            }

            System.out.println(lineBuilder);
        }
    }
}