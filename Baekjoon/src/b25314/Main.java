package b25314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N/4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		scan.close();
	}

}
