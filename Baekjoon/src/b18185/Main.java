package b18185;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//첫째 줄에 공장의 개수 N 입력받.
		//n개의 정수 a1, a2 ... an개 가 주어짐. 1 0 1 이런식
		
		// i번 공장에서 구매하는 경우(1<=i<=N) n이 3일때 1번 공장에서 구매하는 경우 1<1<3 비용은 3
		// i번 공장과 i+1번 공장에서 구매하는 경우 1<1<N-1(2) 왜냐 i+1까지니까 어쨋든 이웃하는 2개사면 비용5
		// i번 공장과 i+1번, i+2번 공장에서 구매 1<1<n-2(1) 이 경우 비용 7이 든다
		//최소한의 비용으로 구매하고자할때 필요한 금액을 출력하는 프로그램.
		
		// 입력값이 5 , 1 1 1 0 2 
		//            비용 7 + 3*2 = 13이 출력되야한다.
		int sum = 0;
		int index = 0;
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		//array를 가 1일때 2일때를 판별해서 비용 곱하기 해야된다..
		
		//이제 array[i]가 0이 될때까지 반복해야함. 
		//array 중에 가장 큰값에서부터 시작해야된다.
		
		//
		while(index<N) {
		for(int i=0; i<N-2;i++) {
			if(array[i]>= 1 && array[i+1]>=1 && array[i+2]>=1) {
				array[i] = array[i] - 1;
				array[i+1] = array[i+1] -1;
				array[i+2] = array[i+2] -1;
				sum = sum + 7;
				index++;
			}
		}
		
		for(int i=0; i<N-1;i++) {
			if(array[i]>= 1 && array[i+1]>=1) {
				array[i] = array[i] - 1;
				array[i+1] = array[i+1] -1;
				sum = sum + 5;
				index++;
			}
		}
		
		
		for(int i=0; i<N;i++) {
			if(array[i]>= 1) {
				array[i] = array[i] - 1;
				sum = sum + 3;
				index++;
			}
		}
		}
	
		System.out.println(sum);
		
	}
}
