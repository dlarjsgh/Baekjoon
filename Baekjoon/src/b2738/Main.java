package b2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// n 과 m 을 입력받는다. n*m크기의 행렬을 2개 입력받는다. 
		//각각의 행을 더한다.
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] array1 = new int[n][m];
		int[][] array2 = new int[n][m];
		int[][] arraysum = new int[n][m];
		
		
		for(int i=0; i<n; i++) {

			StringTokenizer a1 = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				array1[i][j] = Integer.parseInt(a1.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {

			StringTokenizer a2 = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				array2[i][j] = Integer.parseInt(a2.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {

			for(int j=0; j<m; j++) {
				arraysum[i][j] = array1[i][j] + array2[i][j];
			}	
		}
		
		
		for(int i=0; i<n; i++) {

			for(int j=0; j<m; j++) {
				System.out.print(arraysum[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}
}


