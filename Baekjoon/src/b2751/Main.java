package b2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testnumber = Integer.parseInt(br.readLine());
		int array[] = new int[testnumber];
		
		
		for(int c=0; c<testnumber; c++) {
			array[c] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(array);
		
		for(int n: array) {
			System.out.println(n);
		}
	}
}


