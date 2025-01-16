package b9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //40 41
		StringBuilder sb = new StringBuilder();
		
		int testnumber = Integer.parseInt(br.readLine());
		
		for(int c=0; c<testnumber; c++) {
			String s = 	br.readLine();
			int rcount = 0;
			int lcount =0;
			
			for(int i=0; i<s.length(); i++)  {
				if(s.charAt(i) == 41) {
					rcount++;
				}
				else if(s.charAt(i) ==40) {
					lcount++;
				}
				
				if(lcount<rcount) {
					break;
				}
			}
			
			if(lcount == rcount) {
				sb.append("YES").append("\n");
			}
			else if(lcount != rcount) {
				sb.append("NO").append("\n");
			}
		
		}
		
		System.out.println(sb);
		
	}
}


