package b9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int num(int n) { //3일때 num2 +num1 +num 0 / num2는 num1, num 0, num-1
		if(n<0) return 0;
		
		if(n==1) return 1;
		
		return num(n-1) + num(n-2) + num(n-3);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			int p = Integer.parseInt(br.readLine());
			sb.append(num(p) + "\n");
		}
		
		System.out.println(sb);
		
		
	}
}


