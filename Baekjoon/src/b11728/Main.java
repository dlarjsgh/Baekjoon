package b11728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int a1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		
		int[] array1 = new int[a1];
		int[] array2 = new int[a2];
		

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0; i<a1; i++) {
			array1[i] = Integer.parseInt(st1.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<a2; i++) {
			array2[i] = Integer.parseInt(st2.nextToken());
		}
		
		int[] arraysum = new int[a1+a2];
		
		for(int i=0; i<a1; i++) {
			arraysum[i] = array1[i];
		}
		
		for(int i=0; i<a2; i++) {
			arraysum[i+a1] = array2[i];
		}
		
		Arrays.sort(arraysum);
		
		StringBuilder sb = new StringBuilder();
		
		for(int t : arraysum) {
			sb.append(t + " ");
		}
		
		System.out.print(sb);
	}
}
