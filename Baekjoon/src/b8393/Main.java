package b8393;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		scan.close();
	}

}
