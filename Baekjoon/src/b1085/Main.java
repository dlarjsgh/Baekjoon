package b1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = 0;
		int b = 0;
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int a1 = -(a - x);
		int a2 = w - x;
		int a3 = -(b - y)	;
		int a4 = h - y;
		
		
		if(Math.min(a1, a2) < Math.min(a3, a4)) {
			System.out.println(Math.min(a1,a2));
		}
		else System.out.println(Math.min(a3, a4));
		
		
		
	}
}


