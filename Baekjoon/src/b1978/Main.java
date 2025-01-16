package b1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        
	        int n = Integer.parseInt(br.readLine());
	        int count = 0;

	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for (int i = 0; i < n; i++) {
	            int num = Integer.parseInt(st.nextToken());

	            if (num == 1) {
	                continue; // 1은 소수가 아님
	            }

	            int divisorCount = 0;

	            // 2부터 num의 제곱근까지 나누어보면서 나누어떨어지는 수가 있으면 divisorCount 증가
	            for (int j = 2; j * j <= num; j++) {
	                if (num % j == 0) {
	                    divisorCount++;
	                    break; // 한 번이라도 나누어떨어지면 더 이상 체크할 필요 없음
	                }
	            }

	            // divisorCount가 0인 경우, 즉 나누어떨어지는 수가 없으면 소수로 판단
	            if (divisorCount == 0) {
	                count++;
	            }
	        }

	        System.out.println(count);
		
	}
}


