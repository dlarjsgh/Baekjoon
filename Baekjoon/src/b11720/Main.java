package b11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		int a = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		
		for(int i=0; i<a; i++) {
			sum += input.charAt(i) -'0';
		}
		System.out.println(sum);
	}
}
