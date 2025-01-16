package b4673;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {         // 0  48 ~ 57      9
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int a;
		boolean[] b = new boolean[10036];
		
		for(int i=1; i<10000; i++) {
			a = 0;
			String s = Integer.toString(i);
			for(int c=0; c<s.length(); c++) {
				a = a + s.charAt(c) -'0' ;
			}
			b[i+a] = true;
		}
		
		for(int i=1; i<10000; i++) {
			if(b[i] == false) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}


