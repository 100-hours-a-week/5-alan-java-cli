package name;

public class MentByScore {
    private final int score;
    public MentByScore(int score) {
        this.score = score;
    }
    public static void Ment(int score) {
        if (score >= 90){
            System.out.println("한줄 총평 : 점수가 꽤 좋아요! 충분히 가능성 있겠는데요?");
        }
        else if (score >= 75){
            System.out.println("한줄 총평 : 나쁘지 않은 점수입니다! 기대해봐도 좋아요");
        }
        else if (score>=60){
            System.out.println("한줄 총평 : 절반 넘었으면 됐죠~ 한잔해~");
        }
        else if (score >= 45){
            System.out.println("한줄 총평 : 음,, ㅋ");
        }
        else if (score >= 30){
            System.out.println("한줄 총평 : 아쉽네요. 상대방을 개명시키는건 어때요?");
        }
        else{
            System.out.println("한줄 총평 : 이 정도면 다른 사람 알아보시는게 나을 것 같아요");
        }
    }
}
