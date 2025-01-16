package b2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 연도 입력
        int year = scanner.nextInt();

        // 윤년 판별
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1); // 윤년이면 1 출력
        } else {
            System.out.println(0); // 윤년이 아니면 0 출력
        }

        scanner.close();
    }
}
