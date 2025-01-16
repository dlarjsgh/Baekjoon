package b10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int p=1;
		
		for(int i=a; i>0; i--) {
			p=p*i;

		}

		System.out.println(p);
	}
}


