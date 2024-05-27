package name;

public class ScoreByEnglishName {
    private String myName;
    private String yourName;
    public ScoreByEnglishName(String myName, String yourName) {
        this.myName = myName;
        this.yourName = yourName;
    }
    private static final int[] CHAR_VALUES = new int[128];

    static {
        for (char c = 'A'; c <= 'Z'; c++) {
            CHAR_VALUES[c] = c - 'A' + 1;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            CHAR_VALUES[c] = c - 'a' + 1;
        }
    }
    public int calculateNameScore(String name) {
        int score = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c < 128 && CHAR_VALUES[c] > 0) {
                score += CHAR_VALUES[c];
            }
        }
        return score;
    }
}
