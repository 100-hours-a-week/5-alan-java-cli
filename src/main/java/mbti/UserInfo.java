package mbti;



public class UserInfo {
    private String name;
    private int age;
    private String info;
    private char sex;
    private int ageGapUp;
    private int ageGapDown;
    // 생성자에서 Scanner 객체 초기화

    public UserInfo(String name, int age, String info, char sex,int ageGapUp,int ageGapDown) {
        this.name = name;
        this.age = age;
        this.info = info;
        this.sex = sex;
        this.ageGapUp = ageGapUp;
        this.ageGapDown = ageGapDown;
    } // 이렇게 해서 최상위까지 정보 전달 완료 (생성자 및 setter)

    public String getName() {
        return name;
    } // 나머지는 정보를 뽑아갈 수 있는 getter 부분이다

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return info;
    }

    public char getSex() {
        return sex;
    }

    public int getAgeGapUp() {
        return ageGapUp;
    }

    public int getAgeGapDown() {
        return ageGapDown;
    }
}
