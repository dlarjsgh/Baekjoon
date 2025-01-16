package b2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		TreeSet<Integer> numbersort = new TreeSet<Integer>();
		
		
		for(int i=0; i<N; i++) {
			numbersort.add(Integer.parseInt(br.readLine()));			
				}
		
		for(int num : numbersort.descendingSet().descendingSet()) {
			System.out.println(num);
		}
		
		
		
	}
}


