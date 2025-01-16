package b11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int coincase = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		
		int[] array = new int[coincase];
		int count = 0;
		
		for(int i=0; i<coincase; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int j=coincase-1; j>=0; j--) {
			if(money / array[j]>= 1) {

				count += (money / array[j]);
				money = money % array[j];
			}
			else {
				
			}
			
		}
		
		System.out.println(count);
		//동전의 가치가 오름차순으로 주어짐. money / array[last] >= 1 이런식으로 역순으로 나눠지면 나누고 나머지 챙긴다.
				// 4200을 10000으로 나눔 안됨. 5000으로 나눔 안됨 1000으로 나눔 됨 money = 200 count++됐슴
		


		
	}
}


