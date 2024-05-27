package name;
import java.util.Scanner;

public class DisplayScore {
    public static void display(String myName,Scanner scanner){

        System.out.println("1: 상대방의 한글 이름으로 조합 선택");
        System.out.println("2: 상대방의 영어 이름으로 조합 선택");
        int nameMode = scanner.nextInt();
        scanner.nextLine();
        if (nameMode == 1) {
            System.out.print("상대방의 한글 이름을 입력하세요: ");
            String yourName = scanner.nextLine();
            ScoreByKoreanName scoreByKoreanName = new ScoreByKoreanName(myName, yourName);
            int myKoreanNameScore = scoreByKoreanName.calculateNameScore(myName);
            int yourKoreanNameScore = scoreByKoreanName.calculateNameScore(yourName);
            int totalScore = (myKoreanNameScore + yourKoreanNameScore) % 100;
            System.out.println(yourName + "님 과의 점수는 "+totalScore+"점 입니다!");
            MentByScore.Ment(totalScore);

        }
        else if(nameMode == 2){
            System.out.println("혹시 카카오클라우드 스쿨 사람,,,,? :) 넝~담~ ");
            System.out.print("상대방의 영어 이름을 입력하세요: ");
            String yourEnglishName = scanner.nextLine();
            System.out.print("본인의 영어 이름을 입력하세요: ");
            String myEnglishName = scanner.nextLine();
            ScoreByEnglishName scoreByEnglishName = new ScoreByEnglishName(myEnglishName, yourEnglishName);
            int myEnglishNameScore = scoreByEnglishName.calculateNameScore(myEnglishName);
            int yourEnglishNameScore = scoreByEnglishName.calculateNameScore(yourEnglishName);
            int totalEngScore = (myEnglishNameScore + yourEnglishNameScore) % 100;
            System.out.println(yourEnglishName + "님 과의 궁합 점수는 "+totalEngScore+"점 입니다!");
            MentByScore.Ment(totalEngScore);

        }
    }
}
