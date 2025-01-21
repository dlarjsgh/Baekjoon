package b1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] s = new String[n];
		
		for(int i=0; i<n; i++) {
			s[i] = br.readLine();
		}
		//비교를 하는 메서드지. 같다면 알파벳 순으로 정렬해. 비교해서. 다르다면 길이의 차를 리턴해. 리턴값을 쓰나?
		//compareTo()는 아마 단어 정렬 메서드 알파벳 순서
		
		Arrays.sort(s, new Comparator<String>(){
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				else {
					return o1.length() - o2.length();
				}
				
			}
		});
		
		for(int i=0; i<n; i++) {
			if(i!=0) {
				if(s[i].compareTo(s[i-1])!=0) {
					System.out.println(s[i]);
				}
				else 
					System.out.println(s[i]);
			}
		}
		
		
		
	}
}


