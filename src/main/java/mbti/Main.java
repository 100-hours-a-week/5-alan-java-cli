package mbti;
import java.util.Scanner;
import name.*;
public class Main {
    public static void main(String[] args) {

        // 입력받은 값 출
        Scanner scanner = new Scanner(System.in);
        InputInformation inputInformation = new InputInformation(scanner);
        // 생성자 생성을 통해서 기본적인 정보 입력 여기서 진행한다
        String name = inputInformation.getName();
        int age = inputInformation.getAge();
        String info = inputInformation.getInfo();
        char sex = inputInformation.getSex();
        int ageGapUp = inputInformation.getAgeGapUp();
        int ageGapDown = inputInformation.getAgeGapDown();
        BestAndWorse bestAndWorse = new BestAndWorse(name, age, info, sex, ageGapUp, ageGapDown); // 이렇게 객체 생성 가능
        int number = 1;
        // 기본 값 입력 및 가장 아래 자식인 bestAndWorse 객체에게 값 전달 -> super를 통해 값 2번 전달.
        while (number!=0) {
            System.out.println("1: 내 MBTI와 궁합 순위 보기");
            System.out.println("2: 나와 잘 맞는 연예인은 누가 있을까? :)");
            System.out.println("3: 나와 이번생에 만날수 없는 연예인 :( ");
            System.out.println("4: 가장 잘맞는 MBTI && 가장 안맞는 MBTI 탐색 및 설명");
            System.out.println("5: 모든 결과가 마음에 들지 않으신다면? -> 상대방과 이름 조합하러 가기");
            System.out.println("6: 날씨와 MBTI의 연관성을 알고 싶다면? -> 특별히 비동기로 구현했어요! ");
            System.out.println("7: 자신의 MBTI가 시간대별로 어떤 활동에 집중하는게 좋을까요? -> 얘도 특별히 비동기로 구현했어요!");

            System.out.println("0: 프로그램 종료");
            System.out.print("원하는 기능의 숫자를 입력해주세요! : ");
            number = scanner.nextInt();
            // 결과값 출력 전에 -> 확인 -> ~~ 하므로 ~~ + 날씨 스레드 만들어서 1분마다 상태 바꾸기

            if (number == 0) {
                break;
            }
            if (number == 1) {
                Thread thread1 = new Thread(bestAndWorse);
                thread1.start();
                // 1번도 끝 , 수월해졌다 코드가
            } // 여기에 딜레이 기능 넣기
            if (number == 2) {
                WithTheBestStar withTheBestStar = new WithTheBestStar();
                WithTheBestFemaleStar withTheBestFemaleStar = new WithTheBestFemaleStar();
                String[][] celebrities = withTheBestStar.getCelebritiesByInfo(bestAndWorse.getBest());
                String[][] celebritiesFemale = withTheBestFemaleStar.getCelebritiesByInfo(bestAndWorse.getBest());

                DisplayStars displayStars = new DisplayStars(sex, celebrities, celebritiesFemale, info, age, ageGapUp, ageGapDown, number);
                Thread thread3 = new Thread(displayStars);
                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            } // 이부분은 해결
            if (number == 3) {
                WithTheBestStar withTheBestStar = new WithTheBestStar();
                WithTheBestFemaleStar withTheBestFemaleStar = new WithTheBestFemaleStar();
                String[][] celebrities = withTheBestStar.getCelebritiesByInfo(bestAndWorse.getWorst());
                String[][] celebritiesFemale = withTheBestFemaleStar.getCelebritiesByInfo(bestAndWorse.getWorst());
                DisplayStars displayStars = new DisplayStars(sex, celebrities, celebritiesFemale, info, age, ageGapUp, ageGapDown, number);

                Thread thread2 = new Thread(displayStars);
                thread2.start();
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }




            } // 여기선 getWorst 한거로 구현하기
            if (number == 4) {
                Thread thread4 = new Thread(() -> {
                    String best = bestAndWorse.getBest();
                    String worse = bestAndWorse.getWorst();
                    System.out.println("가장 잘 맞는 MBTI: " + best);
                    System.out.println("가장 안 맞는 MBTI: " + worse);
                    bestAndWorse.findInfo(best, worse); // 탐색 후 출력해주기
                });
                thread4.start();
                try {
                    thread4.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } // 일단 4번 기능 구현 완료
            if (number == 5) {
                Thread thread5 = new Thread(() -> {
                    DisplayScore.display(bestAndWorse.getName(), scanner);
                });
                thread5.start();
                try {
                    thread5.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(number == 6){
                Weather weather = new Weather(info);
                Thread thread6 = new Thread(weather);
                thread6.start();

                MBTIbyWeather mbtIbyWeather = new MBTIbyWeather(weather,info);
                Thread thread7 = new Thread(mbtIbyWeather);
                thread7.start();
                try {
                    // 15초 동안 대기
                    thread6.sleep(15000);
                    thread7.sleep(15000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                thread6.stop();
                thread7.stop();
            }
            if(number == 7){
                System.out.println("혹시 상대방의 루틴이 궁금하시다면 1번, 본인 루틴이 알고싶다면 2번을 눌러주세요!");
                System.out.print("원하는 기능의 숫자를 입력해주세요! : ");
                String yourRoutine;
                int mode = scanner.nextInt();
                if(mode == 1){
                    System.out.print("상대방의 MBTI를 모두 대문자로 작성해주세요! : ");
                    yourRoutine = scanner.nextLine();
                    scanner.nextLine();
                    info = yourRoutine;
                }


                Time time = new Time();
                Thread timeThread= new Thread(time);
                timeThread.start();

// 여기 모드에 따라 info 가 한번은 null로 넘어가는 이슈 해결 필요

                RecommendByTime recommendByTime = new RecommendByTime(time,info);
                Thread recommendThread = new Thread(recommendByTime);
                recommendThread.start();
                try {
                    // 15초 동안 대기 후 시간대 스레드 중지
                    Thread.sleep(25000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 시간대 및 추천 스레드 중지
                timeThread.stop();
                recommendThread.stop();
                try {
                    timeThread.join(); // timeOfDayThread가 종료될 때까지 대기
                    recommendThread.join(); // recommenderThread가 종료될 때까지 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 이렇게 하면 rank라는 객체에도 userInfo에 ,,,


        }
        scanner.close();
    }
}
