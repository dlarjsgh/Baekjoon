package b10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int[] array = new int[num];
		String[] strarray = new String[num];
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
			strarray[i] = st.nextToken();
		}
		int box = 0;
		String blank;
		
		for(int i=0; i<num-1; i++) {
			for(int j=0; j<num-1; j++) {
				if(array[j] > array[j+1]) {
					box = array[j];
					array[j] = array[j+1];
					array[j+1] = box;
					blank = strarray[j];
					strarray[j] = strarray[j+1];
					strarray[j+1] = blank;
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			sb.append(array[i]+ " " + strarray[i]+"\n");
		}
		System.out.println(sb);
		
	}
}
