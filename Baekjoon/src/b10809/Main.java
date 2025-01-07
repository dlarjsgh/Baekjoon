package b10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int array[] = new int[26];
		
		for(int i=0; i<26; i++) {
			array[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i); //0일때 c는 b(1) 1일때 c는 a(0) 2일때 c는 e(4)
			if(array[c-'a'] == -1) { //즉 98-97 즉 array[1] = a인데 a가 =-1이라면 i가4일때 j(10) array[10]이  -1이라면
			array[c -'a'] = i;        //array[1] = 0;즉 2번째칸인 a에대해 0이된다. array[10] = 4가된다.
			}
			
		}
		for (int i = 0; i < 26; i++) {
            System.out.print(array[i] + " ");
        }
		
	}
}
