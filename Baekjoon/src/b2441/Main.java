package b2441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		
		for(int i=0; i<a; i++) {
			for(int p=a; p>a-i; p--) {
				sb.append(" ");
			}
			for(int j=0; j<a-i; j++) {	
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb);

		
	}
}
