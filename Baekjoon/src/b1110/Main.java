package b1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 0~99 정수가 주어짐.      주어진 수가 10보다 작다면 0을 붙여 두 자리 수로 만들고 각 자리 숫자의 합 더함.       26이면 다음 숫자는 가장 오른쪽6(2+6)인 68 다음은 8(6+4) 84 다음은 4(8+4)=42 26
		//원래 수로 돌아오는 사이클 수를 구하는 것이 최종 목표
		int count = 1;	

		int first = Integer.parseInt(br.readLine()); //최초의 수
		
		int ten = first/10;               //10의 자리
		int one = first%10;               //1의 자리
	
		
		int n = one*10+(ten+one)%10 ;      //새로운 수
		
		while(first != n) {
			int tenn = n/10;
			int onen = n%10;
			n = onen*10+(tenn+onen)%10;
			count++;
		}
		System.out.println(count);
		
	}
}
