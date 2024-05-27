package mbti;

public class RecommendByTime implements Runnable{
    private final Time time;
    private final String info;
    private volatile boolean running = true;

    public RecommendByTime(Time time, String info) {
        this.time = time;
        this.info = info;
    }
    public void stop() {
        running = false;
    }
    @Override
    public void run(){
        while (running) {
            String currentTimeOfDay = time.getCurrentTime();
            String recommendation = getRecommendation(info, currentTimeOfDay);
            System.out.println("MBTI 유형 " + info + "에게 추천하는 활동: " + recommendation + " (현재 시간대: " + currentTimeOfDay + ")");
            try {
                Thread.sleep(5000); // 5초마다 추천 활동 출력
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private String getRecommendation(String mbti, String timeOfDay) {
        switch (mbti) {
            case "ISTJ":
                switch (timeOfDay) {
                    case "아침": return "계획을 세우고 하루를 준비합니다.";
                    case "오후": return "중요한 업무를 처리합니다.";
                    case "저녁": return "하루를 정리하며 반성합니다.";
                    case "밤": return "차분히 독서를 합니다.";
                }
                break;
            case "ISFJ":
                switch (timeOfDay) {
                    case "아침": return "가족과 함께 아침 식사를 합니다.";
                    case "오후": return "가사를 돌보거나 봉사활동을 합니다.";
                    case "저녁": return "따뜻한 차를 마시며 휴식을 취합니다.";
                    case "밤": return "편안한 음악을 들으며 잠을 준비합니다.";
                }
                break;
            case "INFJ":
                switch (timeOfDay) {
                    case "아침": return "조용한 시간에 명상을 합니다.";
                    case "오후": return "창의적인 작업에 몰두합니다.";
                    case "저녁": return "친구와 깊은 대화를 나눕니다.";
                    case "밤": return "일기를 쓰며 하루를 돌아봅니다.";
                }
                break;
            case "INTJ":
                switch (timeOfDay) {
                    case "아침": return "하루의 목표를 설정합니다.";
                    case "오후": return "집중해서 중요한 프로젝트를 진행합니다.";
                    case "저녁": return "미래 계획을 세웁니다.";
                    case "밤": return "자기계발 서적을 읽습니다.";
                }
                break;
            case "ISTP":
                switch (timeOfDay) {
                    case "아침": return "운동을 하며 하루를 시작합니다.";
                    case "오후": return "새로운 취미에 도전합니다.";
                    case "저녁": return "가벼운 산책을 즐깁니다.";
                    case "밤": return "게임을 하며 스트레스를 풉니다.";
                }
                break;
            case "ISFP":
                switch (timeOfDay) {
                    case "아침": return "자연 속에서 아침을 맞이합니다.";
                    case "오후": return "예술 작업에 몰두합니다.";
                    case "저녁": return "음악을 감상하며 휴식을 취합니다.";
                    case "밤": return "편안한 영화나 드라마를 시청합니다.";
                }
                break;
            case "INFP":
                switch (timeOfDay) {
                    case "아침": return "영감을 받으며 하루를 시작합니다.";
                    case "오후": return "글을 쓰거나 창작활동을 합니다.";
                    case "저녁": return "조용한 카페에서 시간을 보냅니다.";
                    case "밤": return "책을 읽으며 마음의 안정을 찾습니다.";
                }
                break;
            case "INTP":
                switch (timeOfDay) {
                    case "아침": return "새로운 아이디어를 구상합니다.";
                    case "오후": return "문제를 해결하는 데 집중합니다.";
                    case "저녁": return "흥미로운 주제에 대해 연구합니다.";
                    case "밤": return "과학 다큐멘터리를 시청합니다.";
                }
                break;
            case "ESTP":
                switch (timeOfDay) {
                    case "아침": return "활동적인 운동으로 하루를 시작합니다.";
                    case "오후": return "야외에서 액티비티를 즐깁니다.";
                    case "저녁": return "친구들과 만남을 가집니다.";
                    case "밤": return "파티를 즐기며 스트레스를 풉니다.";
                }
                break;
            case "ESFP":
                switch (timeOfDay) {
                    case "아침": return "활기찬 음악을 들으며 하루를 시작합니다.";
                    case "오후": return "친구들과 쇼핑을 즐깁니다.";
                    case "저녁": return "즐거운 모임을 가집니다.";
                    case "밤": return "댄스 클럽에서 춤을 춥니다.";
                }
                break;
            case "ENFP":
                switch (timeOfDay) {
                    case "아침": return "창의적인 프로젝트를 시작합니다.";
                    case "오후": return "새로운 사람들을 만납니다.";
                    case "저녁": return "여행 계획을 세웁니다.";
                    case "밤": return "꿈을 꾸며 상상에 잠깁니다.";
                }
                break;
            case "ENTP":
                switch (timeOfDay) {
                    case "아침": return "토론을 통해 아이디어를 공유합니다.";
                    case "오후": return "새로운 프로젝트를 시작합니다.";
                    case "저녁": return "친구들과 열띤 토론을 합니다.";
                    case "밤": return "창의적인 아이디어를 구상합니다.";
                }
                break;
            case "ESTJ":
                switch (timeOfDay) {
                    case "아침": return "업무 계획을 세우고 실행합니다.";
                    case "오후": return "효율적으로 업무를 처리합니다.";
                    case "저녁": return "운동을 하며 건강을 챙깁니다.";
                    case "밤": return "하루를 정리하고 다음 날을 준비합니다.";
                }
                break;
            case "ESFJ":
                switch (timeOfDay) {
                    case "아침": return "가족과 함께 아침을 보냅니다.";
                    case "오후": return "사회 활동에 참여합니다.";
                    case "저녁": return "친구들과 저녁 식사를 합니다.";
                    case "밤": return "편안한 시간 동안 TV를 시청합니다.";
                }
                break;
            case "ENFJ":
                switch (timeOfDay) {
                    case "아침": return "사람들과 함께 아침 식사를 합니다.";
                    case "오후": return "봉사활동을 합니다.";
                    case "저녁": return "모임을 주최합니다.";
                    case "밤": return "하루를 돌아보며 명상합니다.";
                }
                break;
            case "ENTJ":
                switch (timeOfDay) {
                    case "아침": return "목표를 설정하고 하루를 시작합니다.";
                    case "오후": return "중요한 업무를 처리합니다.";
                    case "저녁": return "네트워킹 활동을 합니다.";
                    case "밤": return "자기계발 활동에 집중합니다.";
                }
                break;
            default:
                return "추천 활동을 찾을 수 없습니다.";
        }
        return "추천 활동을 찾을 수 없습니다.";
    }
}
