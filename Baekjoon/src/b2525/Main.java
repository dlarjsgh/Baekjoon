package b2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int t = scan.nextInt();
	
		if((h+((m+t)/60)<24) && 0<=t && t<=1000 && 0<=m && m<=60) {
			System.out.printf("%d %d", h+((m+t)/60),(m+t)%60);
		}
		else if((h+((m+t)/60)>=24) && 0<=t && t<=1000 && 0<=m && m<=60) {
			System.out.printf("%d %d", (h+((m+t)/60)-24),(m+t)%60);
		}
		else {
			System.out.println("Error");
		}
		
		scan.close();
	}
}