package b10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //수열 크기
		int X = Integer.parseInt(st.nextToken()); //입력한 X값보다 작은 거 찾음
		
		st = new StringTokenizer(br.readLine());
		
		int[] array = new int[N];
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i] < X) {
				sb.append(array[i]).append(" ");
			}
		}
		System.out.print(sb);
	}
}
