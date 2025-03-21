package b2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[5];
		
		
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum = sum + array[i];
		}
		
		Arrays.sort(array);
		
		
		System.out.println(sum/5);
		System.out.println(array[2]);
	}
}
