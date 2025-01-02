package b2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int r = a;
		
		
		if(a==b && b==c) {
			System.out.println(10000+(a*1000));
		}
		else if(a==b) {
			System.out.println(1000+(a*100));
		}
		else if(a==c) {
			System.out.println(1000+(a*100));
		}
		else if(b==c) {
			System.out.println(1000+(b*100));
		}
		else{
			if(a>b && a>c) {
				r=a;
			}
			else if (b>c && b>a) {
				r=b;
			}
			else if (c>a && c>b) {
				r=c;
			}
			System.out.println(r*100);
		}
		
		scan.close();
		
	}
}