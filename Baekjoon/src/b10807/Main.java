package b10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if(array[i] == v) {
				sum = sum+1;
			}
		}
		System.out.print(sum);
	}
}
