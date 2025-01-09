package b2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a=0;
		int b=0;
		int c=0;

		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());

		String s = Integer.toString(a*b*c);		
		
		int frequency[] = new int[10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)-'0'==i) {
					frequency[i]++;
				} 
			}
		}
		for(int i=0; i<10; i++) {
			System.out.println(frequency[i]);
		}
	}
}
