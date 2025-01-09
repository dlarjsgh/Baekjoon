package b3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		sb.append(1-k).append(" ").append(1-q).append(" ").append(2-r).append(" ").append(2-b).append(" ").append(2-n).append(" ").append(8-p).append(" ");
		System.out.println(sb);
		
	}
}
