package b10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = null;
		
		
		int A=1;
		int B=1;
		int sum=0;
		
		while ((A+B) != 0 ) {

			st = new StringTokenizer(br.readLine());	
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if(A+B != 0) {
			sb.append(A+B).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}