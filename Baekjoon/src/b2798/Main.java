package b2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = Integer.MAX_VALUE; //최솟값을 갱신하기 위해 설정.
		
		int testnumber = Integer.parseInt(st.nextToken()); //숫자수
		int array[] = new int[testnumber];                 //숫자 배열에 저장
		
		TreeSet<Integer> treeset = new TreeSet<>();         //왜 썻냐함은 last() 메서드와 중복값 제거가 가능, add 메서드 
		TreeSet<Integer> treesetsum = new TreeSet<>();      //근데 굳이 Set이나 arraylist말고 그냥 배열을 쓰는 게 빠를 것이다..	
		
		
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int c=0; c<testnumber; c++) {
			array[c] = Integer.parseInt(st.nextToken());
		}

		
		for(int i=0; i<testnumber-2; i++) {   //0
			for(int j=i+1; j<testnumber-1; j++) {  //1        // 0 1 2  0 1 3  0 1 4  1 2 3   1 2 4    2 3 4      
				for(int k=j+1; k<testnumber; k++) {  //2  3 4         
					treeset.add(array[i] + array[j] + array[k]);
					
				}
			}
		}
		
		for(int n: treeset) {
			if(m-n<min && m-n>=0) {
				min = m-n;
				treesetsum.add(n);
			}
		}
	
		System.out.println(treesetsum.last());
	}
}


