package b2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int t = 45;
	
		
		if(h>=0 && h<24 && m>=45) { 
			System.out.printf("%d %d", h, (m-t));
		}
		else if(h>0 && h<24 && m<45) { 
			System.out.printf("%d %d", h-1, (m-t+60));
		}
		else if(h==0 && m<45) { 
			System.out.printf("%d %d", 23, (m-t+60));
		}
		
		
		scan.close();
	}
}
