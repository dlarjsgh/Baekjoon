package b15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());  // 테스트 케이스의 수
        
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");  // 공백을 기준으로 입력값을 나눈다.
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write((a + b) + "\n");  // 두 수의 합을 출력
        }
        
        bw.flush();  // 출력 버퍼에 남아있는 내용을 모두 출력
        bw.close();
        br.close();
    }
}

