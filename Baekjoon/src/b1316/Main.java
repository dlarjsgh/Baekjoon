package b1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //a=97  z=122
		
		boolean[] group = new boolean[26];
		int testnumber = Integer.parseInt(br.readLine());
		int count = testnumber;
		
		for(int c=0; c<testnumber; c++) {
			String s = s = br.readLine();
			
			for(int i=0; i<26; i++) { //모든 알파벳 소문자에 대해 false 
				group[i] = false; 
			}
			
			for(int i=0; i<s.length(); i++) {
				if(group[s.charAt(i) -'a'] == false) {	
				group[s.charAt(i) -'a'] = true;													//abcda 이미 a가 나와서 true i=4 이미 트루& 
				}
				else if(group[s.charAt(i) -'a'] == true && (s.charAt(i)-'a' != s.charAt(i-1)-'a')) { 
					count--;
					break;
				}
				
			}
		
		}
		System.out.println(count);
	}
}


