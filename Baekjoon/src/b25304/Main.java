package b25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt(); //물건 총 결제 금액 첫번째 줄
		int N = scan.nextInt(); //물건의 종류
		int a, b, sum = 0; //가격, 수량, 합계
		
		for(int i=1; i<=N; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			sum = sum + (a*b);
		}
		if(sum==X) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		scan.close();
	}

}
