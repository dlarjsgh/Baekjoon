package b8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		

		int count=0;
		int save =0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {                    
			String s = br.readLine();
			
			
			for(int j=0; j<s.length(); j++) {   
				if(s.charAt(j)-79 == 0) {
					count= count+1;
					save += count;
				}
				else if(s.charAt(j)-88 ==0) {
					count = 0;
				}

				
			} sb.append(save+"\n");
			save =0;
			count=0;
		}
		
		System.out.println(sb);
		
		
	}
}


