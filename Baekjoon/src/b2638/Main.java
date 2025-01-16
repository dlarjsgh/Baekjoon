package b2638;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //세로
		int m = Integer.parseInt(st.nextToken()); //가로
		

		int[][] array = new int[n][m];
		boolean[][] c = new boolean[n][m];
		
		
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer nst = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				array[i][j] = Integer.parseInt(nst.nextToken());
			}
		}
		
		int count = 0;
		
		
		while (containsTrue(c)) {
			count++;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				c[i][j] = false;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {	
				if(array[i][j] == 1) {
					if(array[i-1][j] == 0 && array[i+1][j] ==0) {
						c[i][j] = true; 
					}
					else if(array[i-1][j] == 0 && array[i][j-1] ==0) {
						c[i][j] = true;
					}
					else if(array[i-1][j] == 0  && array[i][j+1] ==0) {
						c[i][j] = true;
					}
					else if(array[i+1][j] ==0 && array[i][j-1] == 0  ) {
						c[i][j] = true;
					}
					else if(array[i+1][j] ==0 &&  array[i][j+1] ==0) {
						c[i][j] = true;
					}
					else if(array[i][j-1] ==0  && array[i][j+1] ==0) {
						c[i][j] = true;
					}
					
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(c[i][j] == true) {
					array[i][j] = 0;
				}
			}
		}
		
	}
		System.out.println(count);
	}

	private static boolean containsTrue(boolean[][] c) {
        for (boolean[] row : c) {
            for (boolean value : row) {
                if (value) {
                    return true; // true가 발견되면 즉시 종료
                }
            }
        }
		return false;
	}


}


