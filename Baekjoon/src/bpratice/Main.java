package bpratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] array = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
		for(int i=0; i<a; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		int b = Integer.parseInt(br.readLine());
		int[] array2 = new int[b];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<b; i++) {
			array2[i] = Integer.parseInt(st.nextToken());
		}

		for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
				if(array2[i] == array[j]) {
					sb.append("1").append("\n");	
				}
			}
		}
		
		System.out.println(sb);
		
	}
}
