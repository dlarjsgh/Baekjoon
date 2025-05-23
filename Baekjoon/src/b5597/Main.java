package b5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		boolean[] submitted = new boolean[31];
		
		for(int i=0; i<28; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			submitted[n] = true;
		}
		
		for(int j=1; j<31; j++) {
			if(submitted[j]!=true) {
				sb.append(j).append("\n");          //어떻게하면 반복문 안에서 서로 스위칭할수 있을까...
				}
			}
		
		System.out.println(sb);
		
	}	
}
