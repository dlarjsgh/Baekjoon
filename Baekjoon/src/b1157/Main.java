package b1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[26];
        
        String s = br.readLine().toUpperCase();
        
        for(int i=0; i<s.length(); i++) {
        	array[s.charAt(i)-65]++;
        }
        
        int maxcount = 0;
        int max = 0;
        int count =0;
        
        for(int i=0; i<26; i++) {
        	if(maxcount<array[i]) {
        		maxcount = array[i];
        		max = i; 
        	}
        }
        
        for(int i=0; i<26; i++) {
        	if(maxcount == array[i]) {
        		count++;
        	}
        }
        
        if(count>=2) {
        	max = -2;
        }
        
       
        System.out.println((char) (max+65));
        
    }
}
