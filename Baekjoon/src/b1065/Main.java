package b1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			String s = Integer.toString(i);
			
			if(s.length()==1) {
				count++;
			}
			else if(s.length()==2) {
					count++;
			}
			else if(s.length()==3 && (s.charAt(1) -'0') - (s.charAt(0) - '0') == (s.charAt(2) -'0') - (s.charAt(1) - '0')) {
					count++;
			
			}
			else if (s.length()==4 && (s.charAt(1) -'0') - (s.charAt(0) - '0') == (s.charAt(2) -'0') - (s.charAt(1) - '0')  &&    (s.charAt(2) -'0') - (s.charAt(1) - '0') == (s.charAt(3) -'0') - (s.charAt(2) - '0')  )   {
				count++;
			}
			
		}
		
		
		System.out.println(count);
		
	}
}


