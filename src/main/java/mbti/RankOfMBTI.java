package mbti;



public class RankOfMBTI extends UserInfo implements Runnable {
    String[] mbtiTypes = {
            "ISTJ", "ISFJ", "INFJ", "INTJ",
            "ISTP", "ISFP", "INFP", "INTP",
            "ESTP", "ESFP", "ENFP", "ENTP",
            "ESTJ", "ESFJ", "ENFJ", "ENTJ"
    };
    private String best;
    private String worst;
    private static final Object lock = new Object();

    private String info;
    private int index;
    public RankOfMBTI(String name, int age, String info,  char sex,int ageGapUp,int ageGapDown) {
        super(name, age, info, sex,ageGapUp,ageGapDown);
        this.info = info;

    }

    // 2차원 배열로 각 MBTI 유형의 궁합 순위를 정의
    String[][] mbtiRankings = {
            {"ESTP", "ISTJ", "ESTJ", "INTJ", "ESFJ", "ISFJ", "ENTJ", "INTP", "ENFJ", "INFJ", "INFP", "ENFP", "ESFP", "ISFP", "ENTP", "ISTP"},
            {"ESFP", "ISFJ", "ESTJ", "ISTJ", "ESFJ", "ISFP", "ENTJ", "INTJ", "ENTP", "INTP", "ENFJ", "INFJ", "ENFP", "INFP", "ESTP", "ISTP"},
            {"ENTP", "INFJ", "ENFJ", "INTJ", "INTP", "ENTJ", "ENFP", "INFP", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"},
            {"ENFP", "INTJ", "ENTP", "INFJ", "INTP", "ENTJ", "ENFJ", "INFP", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"},
            {"ESFJ", "ISTP", "ESTP", "ISFP", "ENTP", "INTP", "ENTJ", "INTJ", "ESFP", "ISFJ", "ESTJ", "ISTJ", "ENFJ", "INFJ", "ENFP", "INFP"},
            {"ESFJ", "ISFP", "ESTP", "ISTP", "ESFP", "ISFJ", "ENFJ", "INFJ", "ENFP", "INFP", "ENTJ", "INTJ", "ENTP", "INTP", "ESTJ", "ISTJ"},
            {"ENFJ", "INFP", "ENFP", "INFJ", "ENTP", "INTP", "ENTJ", "INTJ", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"},
            {"ENTJ", "INTP", "ENTP", "INTJ", "ENFJ", "INFJ", "ENFP", "INFP", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"},
            {"ISTJ", "ESTP", "ISTP", "ISFP", "ESFP", "ISFJ", "ENTP", "INTP", "ENTJ", "INTJ", "ENFJ", "INFJ", "ENFP", "INFP", "ESTJ", "ESFJ"},
            {"ISFJ", "ESFP", "ESTP", "ISTP", "ISFP", "ESFJ", "ENFP", "INFP", "ENFJ", "INFJ", "ENTP", "INTP", "ENTJ", "INTJ", "ESTJ", "ISTJ"},
            {"INTJ", "ENFP", "INFP", "INFJ", "ENTP", "INTP", "ENFJ", "ENTJ", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"},
            {"INFJ", "ENTP", "INTP", "INTJ", "ENFP", "INFP", "ENFJ", "ENTJ", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"},
            {"ISFJ", "ESTJ", "ISTJ", "ESFJ", "ISFP", "ESFP", "ENTP", "INTP", "ENTJ", "INTJ", "ENFJ", "INFJ", "ENFP", "INFP", "ESTP", "ISTP"},
            {"ISFP", "ESFJ", "ESTJ", "ISFJ", "ESFP", "ESTP", "ENFJ", "INFJ", "ENFP", "INFP", "ENTJ", "INTJ", "ENTP", "INTP", "ISTJ", "ISTP"},
            {"INFP", "ENFJ", "INFJ", "ENFP", "INTP", "ENTP", "ENTJ", "INTJ", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"},
            {"INTP", "ENTJ", "ENTP", "INTJ", "INFJ", "ENFJ", "ENFP", "INFP", "ISFP", "ESFP", "ESTP", "ISTP", "ISFJ", "ESFJ", "ESTJ", "ISTJ"}
    };


    public void run() {
        synchronized (lock){
        for (int i = 0; i < mbtiTypes.length; i++) {
            if (info.equals(mbtiTypes[i])) {
                System.out.println(mbtiTypes[i] + " 궁합 순위:");
                for (int j = 0; j < mbtiRankings[i].length; j++) {
                    System.out.println((j + 1) + ": " + mbtiRankings[i][j]);
                }
                System.out.println();

            }

            }



        }


    }



    public String getBest() {
        for (int i = 0; i < mbtiTypes.length; i++) {
            if (info.equals(mbtiTypes[i])) {
                this.index = i;
            } // userInfo.getInfo 쓸 필요 없이 여기서 생성자로 만들면됨
        }

        return mbtiRankings[index][0];


    }

    public String getWorst() {
       /* for (int i = 0; i < mbtiTypes.length; i++) {
            if (userInfo.getInfo().equals(mbtiTypes[i])) {
                this.index = i;
            }
        }

        */
        return mbtiRankings[index][15];


    }


}
