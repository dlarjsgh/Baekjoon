package b5568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int array[] = null;
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
	}
}
