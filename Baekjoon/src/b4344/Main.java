package b4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int casenum = Integer.parseInt(br.readLine());

		
		for(int i=0; i<casenum; i++) {
		st = new StringTokenizer(br.readLine());
		int human = Integer.parseInt(st.nextToken());
		int array[] = new int[human];
		int count=0;
		int sum=0;
		
		for(int j=0; j<human; j++) {
			array[j] = Integer.parseInt(st.nextToken());
			sum += array[j];
			
		} 
		double avg = (double) sum/human;
		
		for(int c =0; c<human; c++) {
			if(array[c]>avg) {
				count++;
			}
		} sb.append(String.format("%.3f%%", (double) count / human * 100)).append("\n");
			
			
		}	
		System.out.println(sb);
	}
}


