package b2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int f = 0;
		
		if(n%5 == 1) {
			f= ((n/5)-1) + (n%5+5)/3; 
		}
		else if(n%5%3 == 0) {
			f = n/5 + (n%5)/3;
		}
		else if((n/5)>=1 && n%5==4) {
			f= ((n/5)-1) + (n%5+5)/3; 
		}
		else if((n/5)>=2 && n%5==2) {
			f= ((n/5)-2) + (n%5+10)/3;
		}
		else {
			f=-1;
		}
		
		System.out.println(f);
	}
}


