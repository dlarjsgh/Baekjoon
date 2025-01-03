package b2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int max = Integer.MIN_VALUE;
		int same = 0;		
		
		int[] array = new int[9];
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
			
			if(array[i]>max) {
				max=array[i];
			}
			if(array[i]==max) {
				same=i+1;
			}
			
		}
		System.out.println(max);
		System.out.println(same);
		
	}
	
}
