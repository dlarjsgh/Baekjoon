package b11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int p = 0;

		int person = Integer.parseInt(br.readLine());

		int[] array = new int[person];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<person; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		for(int i=0; i<person; i++) {
			p = p + array[i]; 
			sum += p;    
		}
			     
		System.out.println(sum);
		
		
	}
}


