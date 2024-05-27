package mbti;

public class DisplayStars implements Runnable{

    private char sex;
    private String[][] celebrities;
    private String[][] celebritiesFemale;
    private String info;
    private int age;
    private int ageGapDown;
    private int ageGapUp;
    private int number;



    public DisplayStars(char sex, String[][] celebrities, String[][] celebritiesFemale, String info, int age, int ageGapUp, int ageGapDown, int number)
    {
        this.sex = sex;
        this.celebrities = celebrities;
        this.info = info;
        this.age = age;
        this.ageGapUp = ageGapUp;
        this.ageGapDown = ageGapDown;
        this.number = number;
        this.celebritiesFemale = celebritiesFemale;
    }

    public void run() {
        if (sex == 'F' && celebrities != null) {
            System.out.println(info + " Celebrities:");
            if(number == 2) {
                System.out.println("알려주신 나이차이를 반영해서 잘 맞는 연예인을 알려드려요!");
            }
            else if(number == 3){
                System.out.println("알려주신 나이차이를 반영해서 이번 생에는 안 맞는 연예인을 알려드려요!");
            }
            for (String[] celebrity : celebrities) {
                if (age - ageGapDown <= Integer.parseInt(celebrity[1]) && age + ageGapUp >= Integer.parseInt(celebrity[1])) {
                    System.out.println("이름: " + celebrity[0] + ", Age: " + celebrity[1] + ", Occupation: " + celebrity[2]);
                }
            }
        } else {
            System.out.println("No celebrities found for MBTI type: " + info);
        }
        if (sex == 'M' && celebritiesFemale != null) {
            System.out.println(info + " Celebrities:");
            if(number == 2) {
                System.out.println("알려주신 나이차이를 반영해서 잘 맞는 연예인을 알려드려요!");
            }
            else if(number == 3){
                System.out.println("알려주신 나이차이를 반영해서 이번 생에는 안 맞는 연예인을 알려드려요!");
            }
            for (String[] celebrity : celebritiesFemale) {
                if (age - ageGapDown <= Integer.parseInt(celebrity[1]) && age + ageGapUp >= Integer.parseInt(celebrity[1])) {
                    System.out.println("이름: " + celebrity[0] + ", Age: " + celebrity[1] + ", Occupation: " + celebrity[2]);
                }
            }
        }
    }
}
