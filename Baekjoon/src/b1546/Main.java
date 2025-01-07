package b1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 과목 수
        int[] array = new int[n];  // 점수 배열
        int maxscore = 0;
        double sum = 0;  // 합을 double로 선언하여 정확한 평균 계산

        // 점수 입력 받기
        st = new StringTokenizer(br.readLine());  // 한 줄에 모든 점수가 주어짐
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if (array[i] > maxscore) {
                maxscore = array[i];  // 최댓값을 찾음
            }
        }

        // 점수 비율로 변환 (소수점 계산을 위해 double로 처리)
        for (int i = 0; i < n; i++) {
            sum += (double) array[i] / maxscore * 100;  // 각 점수를 최댓값으로 나누고 100을 곱함
        }

        // 결과 출력
        System.out.printf("%.2f", sum / n);  // 평균 출력 (소수점 두 자리를 출력)
    }
}
