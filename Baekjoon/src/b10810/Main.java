package b10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //바구니 개수
		int M = Integer.parseInt(st.nextToken()); //바구니에 공을 넣을 시행횟수 시행횟수만큼 i j k 입력받음
		//i번(2번) 바구니 부터 j번(5번) 바구니까지 k번(6번) 공을 넣는다.
		int i, j, k =0;
		int[] array = new int[N];
		
		for(int c=0; c<M; c++) {

			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			for(; i<=j; i++) {
				array[i-1] = k;
			}
		}
		for(int o =0; o<N; o++) {
		System.out.print(array[o]+" ");
		}
	}
	
}
