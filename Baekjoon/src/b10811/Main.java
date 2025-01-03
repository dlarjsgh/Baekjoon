package b10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()); //시행횟수 입력
		
		int array[] = new int[n]; //배열 생성
		for(int k=0; k<n; k++) { //바구니 순서와 동일한 공 넣음
			array[k] = k+1;
		}
	
		for(int i=0; i<m; i++) { //시행횟수만큼 반복한다.
			st = new StringTokenizer(br.readLine()); //입력 초기화
			int a = Integer.parseInt(st.nextToken())-1; //바구니 시작
			int b = Integer.parseInt(st.nextToken())-1; //바구니 끝
			
			while(a<b) {
				int c = array[b];
				array[b] = array[a];
				array[a] = c;
				a++;
				b--;
			}
		
		}
		
		
		for(int i=0; i<n; i++) {
			sb.append(array[i]).append(" ");
		}
		System.out.print(sb);
	}
}
