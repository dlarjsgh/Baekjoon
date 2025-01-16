package b14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		if(a>0 && a<=1000 && b>0 && b<=1000)
			System.out.println("1");
		else if(a<0 && a>=-1000 && b>0 && b<=1000)
			System.out.println("2");
		else if(a<0 && a>=-1000 && b<0 && b>=-1000)
			System.out.println("3");
		else if(a>0 && a<=1000 && b<0 && b>=-1000)
			System.out.println("4");
		
	}
}


