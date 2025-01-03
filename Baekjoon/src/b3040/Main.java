package b3040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int array[] = new int[9];
		int sum = 0;
		
		for(int i=0; i<9;i++) {
			st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
			sum += array[i];	
		}
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++ ) {
				if(sum - (array[i]+array[j])==100) {
					array[i]=0;
					array[j]=0;
					for(int k=0; k<9;k++) {
						if(array[k]!=0) {
							System.out.println(array[k]);
						}
					}
				}
			}
		}
		
		
	}
}
