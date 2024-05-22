package name;

import mbti.*;

public class ScoreByName {
    private String myName;
    private String yourName;
    public ScoreByName(String myName, String yourName) {
        this.myName = myName;
        this.yourName = yourName;
    }
     // 여기 로직은 뭐 괜찮음
     private static final int[] CHOSUNG_STROKES = {
             2, 3, 3, 4, 4, 4, 4, 3, 3, 2, 3, 2, 4, 2, 4, 3, 3, 3, 2
     };
    private static final int[] JUNGSUNG_STROKES = {
            2, 3, 3, 3, 3, 3, 2, 2, 2, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 2, 3
    };
    private static final int[] JONGSUNG_STROKES = {
            0, 2, 3, 3, 4, 3, 4, 3, 3, 3, 3, 2, 4, 2, 4, 3, 2, 3, 3, 3, 2, 4, 3, 3, 2, 4, 4, 4
    };

    public static int calculateNameScore(String name) {
        int score = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c >= '가' && c <= '힣') {
                int unicode = c - '가';
                int chosungIndex = unicode / (21 * 28);
                int jungsungIndex = (unicode % (21 * 28)) / 28;
                int jongsungIndex = unicode % 28;

                score += CHOSUNG_STROKES[chosungIndex];
                score += JUNGSUNG_STROKES[jungsungIndex];
                score += JONGSUNG_STROKES[jongsungIndex];
            }
        }
        return score;
    }
    int score1 = calculateNameScore(myName);
    int score2 = calculateNameScore(yourName);


}
