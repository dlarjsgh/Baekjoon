package b10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //바구니 개수
		int M = Integer.parseInt(st.nextToken()); //공 바꾸는 횟수
		int array[] = new int[N];
		
		for(int i=0; i<N; i++) {  //공 넣음
			array[i] = i+1;
		}
		
		for(int j=0; j<M; j++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c;
			c = array[a-1]; 
			array[a-1] = array[b-1];
			array[b-1] = c;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int d : array) {
			sb.append(d).append(" ");
		}
		
		System.out.println(sb);
		
	}
	
}