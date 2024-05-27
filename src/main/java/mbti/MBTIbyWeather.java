package mbti;
import java.util.HashMap;
import java.util.Map;
public class MBTIbyWeather implements Runnable{
    private final Weather weather;
    private final String info;
    private final String[][] reactions;
    public MBTIbyWeather(Weather weather, String info) {
        this.weather = weather;
        this.info = info;
        this.reactions = initializeReactions();
    }
    private String[][] initializeReactions() {
        return new String[][] {
                {"ISTJ", "맑음", "계획적인 하루를 시작합니다."},
                {"ISTJ", "흐림", "실내에서 집중할 일을 찾습니다."},
                {"ISTJ", "비", "효율적으로 우산을 챙겨 나갑니다."},
                {"ISTJ", "눈", "조용히 눈을 감상합니다."},
                {"ISTJ", "바람", "바람을 피해 일에 집중합니다."},
                {"ISFJ", "맑음", "가족과 함께 산책합니다."},
                {"ISFJ", "흐림", "집에서 따뜻한 차를 마십니다."},
                {"ISFJ", "비", "창밖을 보며 책을 읽습니다."},
                {"ISFJ", "눈", "눈사람을 만들어봅니다."},
                {"ISFJ", "바람", "창문을 닫고 따뜻한 시간을 보냅니다."},
                {"INFJ", "맑음", "공원에서 사색합니다."},
                {"INFJ", "흐림", "음악을 들으며 생각에 잠깁니다."},
                {"INFJ", "비", "비 소리를 들으며 글을 씁니다."},
                {"INFJ", "눈", "눈 내리는 풍경을 사진으로 담습니다."},
                {"INFJ", "바람", "바람 소리를 들으며 명상합니다."},
                {"INTJ", "맑음", "목표를 설정하고 실행합니다."},
                {"INTJ", "흐림", "미래 계획을 점검합니다."},
                {"INTJ", "비", "실내에서 독서와 연구를 합니다."},
                {"INTJ", "눈", "차분히 일을 계획합니다."},
                {"INTJ", "바람", "바람을 무시하고 집중합니다."},
                {"ISTP", "맑음", "야외에서 취미 활동을 합니다."},
                {"ISTP", "흐림", "실내에서 공예를 즐깁니다."},
                {"ISTP", "비", "빗속을 걸으며 생각을 정리합니다."},
                {"ISTP", "눈", "스노보드를 즐깁니다."},
                {"ISTP", "바람", "바람을 느끼며 드라이브합니다."},
                {"ISFP", "맑음", "자연 속에서 여유를 즐깁니다."},
                {"ISFP", "흐림", "집에서 예술 작업을 합니다."},
                {"ISFP", "비", "비 내리는 풍경을 그림으로 그립니다."},
                {"ISFP", "눈", "눈 속에서 산책을 즐깁니다."},
                {"ISFP", "바람", "바람 소리를 음악으로 표현합니다."},
                {"INFP", "맑음", "야외에서 영감을 얻습니다."},
                {"INFP", "흐림", "글을 쓰며 내면을 탐색합니다."},
                {"INFP", "비", "창밖을 보며 시를 씁니다."},
                {"INFP", "눈", "눈 내리는 날의 아름다움을 묘사합니다."},
                {"INFP", "바람", "바람 소리를 들으며 상상합니다."},
                {"INTP", "맑음", "야외에서 사고의 흐름을 정리합니다."},
                {"INTP", "흐림", "실내에서 새로운 아이디어를 생각합니다."},
                {"INTP", "비", "빗소리를 들으며 문제를 해결합니다."},
                {"INTP", "눈", "눈을 보며 차분히 연구합니다."},
                {"INTP", "바람", "바람 소리를 분석합니다."},
                {"ESTP", "맑음", "야외 활동을 즐깁니다."},
                {"ESTP", "흐림", "실내에서 게임을 합니다."},
                {"ESTP", "비", "빗속에서 모험을 즐깁니다."},
                {"ESTP", "눈", "눈싸움을 합니다."},
                {"ESTP", "바람", "바람을 맞으며 액션 스포츠를 합니다."},
                {"ESFP", "맑음", "친구들과 함께 야외 활동을 합니다."},
                {"ESFP", "흐림", "집에서 파티를 엽니다."},
                {"ESFP", "비", "빗속에서 춤을 춥니다."},
                {"ESFP", "눈", "눈 속에서 놀이를 합니다."},
                {"ESFP", "바람", "바람을 맞으며 자유를 만끽합니다."},
                {"ENFP", "맑음", "창의적인 프로젝트를 시작합니다."},
                {"ENFP", "흐림", "친구들과 깊은 대화를 나눕니다."},
                {"ENFP", "비", "빗소리를 들으며 상상합니다."},
                {"ENFP", "눈", "눈 내리는 날의 낭만을 즐깁니다."},
                {"ENFP", "바람", "바람을 맞으며 영감을 얻습니다."},
                {"ENTP", "맑음", "야외에서 새로운 아이디어를 탐구합니다."},
                {"ENTP", "흐림", "실내에서 토론을 즐깁니다."},
                {"ENTP", "비", "빗소리를 들으며 혁신을 구상합니다."},
                {"ENTP", "눈", "눈 내리는 날의 신비로움을 탐색합니다."},
                {"ENTP", "바람", "바람을 맞으며 창의성을 발휘합니다."},
                {"ESTJ", "맑음", "계획대로 야외 활동을 합니다."},
                {"ESTJ", "흐림", "실내에서 업무를 처리합니다."},
                {"ESTJ", "비", "우산을 챙겨 활동합니다."},
                {"ESTJ", "눈", "눈 속에서도 계획을 실천합니다."},
                {"ESTJ", "바람", "바람을 피해 실내 활동에 집중합니다."},
                {"ESFJ", "맑음", "친구들과 야외에서 시간을 보냅니다."},
                {"ESFJ", "흐림", "실내에서 요리를 합니다."},
                {"ESFJ", "비", "가족과 함께 실내 활동을 즐깁니다."},
                {"ESFJ", "눈", "눈 속에서 가족과 놀이를 합니다."},
                {"ESFJ", "바람", "따뜻한 실내에서 모임을 엽니다."},
                {"ENFJ", "맑음", "사람들과 함께 야외 활동을 기획합니다."},
                {"ENFJ", "흐림", "친구들과 깊은 이야기를 나눕니다."},
                {"ENFJ", "비", "비 오는 날의 분위기를 즐기며 활동합니다."},
                {"ENFJ", "눈", "눈 내리는 날의 낭만을 함께합니다."},
                {"ENFJ", "바람", "바람을 맞으며 리더십을 발휘합니다."},
                {"ENTJ", "맑음", "목표를 설정하고 성취합니다."},
                {"ENTJ", "흐림", "실내에서 전략을 구상합니다."},
                {"ENTJ", "비", "비 오는 날에도 목표를 향해 나아갑니다."},
                {"ENTJ", "눈", "눈 속에서도 계획을 추진합니다."},
                {"ENTJ", "바람", "바람을 무시하고 업무에 집중합니다."}
        };
    }

    @Override
    public void run() {
        while (true) {
            String currentWeather = weather.getCurrentWeather();
            String reaction = getReaction(currentWeather);
            System.out.println(info + " 유형이 " + currentWeather + " 날씨에 반응하는 방식: " + reaction);
            try {
                Thread.sleep(5000); // 3초마다 작업 수행
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String getReaction(String currentWeather) {
        for (String[] reaction : reactions) {
            if (reaction[0].equals(info) && reaction[1].equals(currentWeather)) {
                return reaction[2];
            }
        }
        return "날씨에 따라 활동을 계획합니다.";
    }
}
