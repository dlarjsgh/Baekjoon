package b18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//-10일때 0
		//-9 일때 1
		//2 일때 x1 = 2 x1(2)>xj(?)를 만족하는 서로다른 xj의 좌표의 개수
		//4 일때 3
		//999 일때 0
		//1000 일때 1
		 
		
		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		int array[] = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		
		for(int i=0; i<n; i++) { 
			int count = 0;
			for(int j=0; j<n; j++) {				
			if(array[i]>array[j]) {
				count++;
			}
				
				
			}
			sb.append(count+ " ");
		}

		System.out.print(sb);
	}
}


