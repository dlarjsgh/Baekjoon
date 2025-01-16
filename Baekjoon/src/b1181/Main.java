package b1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		// 문자열을 입력받음. 각 문자열의 길이를 비교하고 또한 아스키 값을 비교..
		
		//문자열의 길이는 50을 넘진 않는다 ... 하지만 알고리즘을 짜야 할 것 같다..
		
		String[] array = new String[a+1]; //값 저장소를 위해 하나 더 만들자
		
		for(int i=0; i<a; i++) {
			array[i] = br.readLine();
		}
		
		//for 문으로 array[i]의 길이와 array[i+1]의 길이를 비교. array[a]에 저장
		
		for(int i=0; i<a-1; i++) {
				if(array[i].length() > array[i+1].length()) {
					array[a] = array[i];
					array[i] = array[i+1];
					array[i+1] = array[a];
			}
		}
		 
		
		for(int i=0; i<a; i++) {
			System.out.println(array[i]);
		}
	}
}


