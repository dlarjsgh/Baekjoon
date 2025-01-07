package b2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine()); //시행횟수
		 
		for(int i=0; i<n; i++) { //시행횟수만큼 반복
			st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken()); //케이스 반복횟수
			String s = st.nextToken(); //여기서 스트링을 입력받아야한다..
			
			for(int j=0; j<s.length(); j++) {
				for(int p=0; p<count; p++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
}
