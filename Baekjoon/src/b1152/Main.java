package b1152;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int count = 0;
		int str;
		int pre_str=32;
		
		while(true) {
			str = System.in.read();
			
			if(str==32) { // bec 처럼 공백이고 공백뒤에 글자(pre_str)이 공백이 아니라면 단어가 한개 있는 것. count++; 아닌 경우는 딱히 생각하지 않아도 되는게 카운트만 증가시키면 되기때문
				if(pre_str!=32) {
					count++;
				}
			}
			
			else if(str==10) {
				if(pre_str!=32) {
					count++;
					break;
				}
			}
			pre_str = str;
				
				
		}
		System.out.println(count);
	}
}
