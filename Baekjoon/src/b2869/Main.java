package b2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int canclimb = Integer.parseInt(st.nextToken());
		int back = Integer.parseInt(st.nextToken());
		int high = Integer.parseInt(st.nextToken());
		            
		int days = (high - canclimb) / (canclimb-back);
		if((high - canclimb) % (canclimb-back) != 0)
			days++;
		
		System.out.println(days+1);
		
	}
}



