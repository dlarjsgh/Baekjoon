package b10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];

        // 배열 입력 받기
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        // 선택 정렬 (Selection Sort)
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i; // 최소값의 인덱스를 찾기 위해 시작값을 i로 설정
            for (int j = i + 1; j < N; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // 더 작은 값이 있으면 minIndex 업데이트
                }
            }

            // 최소값과 현재 위치의 값 교환
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }
    }
}

