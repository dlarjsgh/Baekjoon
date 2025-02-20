package b1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		
		// 1 2 3 5 
		
		for(int i=a; i<=b; i++) {
			if(i>2 &&i%2==0) {
				
			}
			else if(i>3 &&i%3 ==0) {
				
			}
			else if(i>5 && i%3 != 0 && i%2 !=0 && i%5 == 0) {
				
			}
			
			else {
				sb.append(i + "\n");
				}
				
		}
		System.out.println(sb);
		
		
	}
}


