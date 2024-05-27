package mbti;

import java.util.Scanner;

public class InputInformation {
    private final String name;
    private final int age;
    private final String info;
    private final int ageGapUp;
    private final int ageGapDown;
    private final char sex;

    // 생성자에서 Scanner 객체 초기화
    public InputInformation(Scanner scanner){


        System.out.print("이름을 입력하세요: ");
        while (!scanner.hasNextLine()) {
            System.out.println("이름은 정확하게 3글자로 입력하세요.");
            scanner.next(); // 유효하지 않은 입력 무시
            System.out.print("이름을 다시 입력하세요.: ");
        }
        this.name = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        while (!scanner.hasNextInt()) {
            System.out.println("유효한 정수를 입력하세요.");
            scanner.next(); // 유효하지 않은 입력 무시
            System.out.print("나이를 입력하세요: ");
        }
        this.age = scanner.nextInt();
        scanner.nextLine(); // Enter 키 제거

        System.out.print("MBTI를 전부 대문자로 입력하세요: ");
        while (!scanner.hasNextLine()) {
            System.out.println("MBTI를 정확하게 대문자로 입력하세요.");
            scanner.next(); // 유효하지 않은 입력 무시
            System.out.print("MBTI를 전부 대문자로 입력하세요: ");
        }
        this.info = scanner.nextLine();

        System.out.print("원하는 이상적인 나이 차이를 입력하세요 (위로): ");
        while (!scanner.hasNextInt()) {
            System.out.println("유효한 정수를 입력하세요.");
            scanner.next(); // 유효하지 않은 입력 무시
            System.out.print("나이 차이를 입력하세요: ");
        }
        this.ageGapUp = scanner.nextInt();
        scanner.nextLine(); // Enter 키 제거

        System.out.print("원하는 이상적인 나이 차이를 입력하세요 (아래로): ");
        while (!scanner.hasNextInt()) {
            System.out.println("유효한 정수를 입력하세요.");
            scanner.next(); // 유효하지 않은 입력 무시
            System.out.print("나이 차이를 입력하세요: ");
        }
        this.ageGapDown = scanner.nextInt();
        scanner.nextLine(); // Enter 키 제거

        System.out.print("성별을 입력하세요 (M/F): ");
        String input = scanner.nextLine();
        while (input.length() != 1 || !(input.equalsIgnoreCase("M") || input.equalsIgnoreCase("F"))) {
            System.out.println("유효한 성별을 입력하세요 (M/F).");
            System.out.print("성별을 입력하세요 (M/F): ");
            input = scanner.nextLine();
        }
        this.sex = input.charAt(0);



    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return info;
    }

    public int getAgeGapUp() {
        return ageGapUp;
    }
    public int getAgeGapDown() {
        return ageGapDown;
    }

    public char getSex() {
        return sex;
    }
}
