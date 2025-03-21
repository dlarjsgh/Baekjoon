package b25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//20 줄에 과목명 학점.0 성적이 주어진다.  P면 무시 F는 0점 처리 과목명 1~50 학점1.0 ~4.0점 
		//D0~A+까지, 적어도 한 등급은 P가 아님

		//20번을 입력받고 만약 배열을 하나 선언해서 넣냐 20개 선언하냐... 넣고 2번 3번뽑아서 계싼
		int n = 0;
		
		String[] array = new String[60];
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int p=0; p<3; p++) {
				array[n] = st.nextToken();
				n++;
			}
		}
		
		Float[] score = new Float[20];
		String[] grade = new String[20];
		Float sumscore = (float) 0;
		Float sumgrade = (float) 0;
		
		for(int i=0; i<20; i++) {
			score[i] = Float.parseFloat(array[3*i+1]);
		}
		
		for(int i=0; i<20; i++) {
			grade[i] = array[3*i+2];
		}
		
		for(int i=0; i<20; i++) {
				sumscore = sumscore +score[i];
		}
		
		for(int i=0; i<20; i++) {
			if(grade[i].equals("D0")) {
				sumgrade = sumgrade + 1*score[i];
			}
			else if(grade[i].equals("D+")) {
				sumgrade = (float) (sumgrade + 1.5*score[i]);
			}
			else if(grade[i].equals("C0")) {
				sumgrade = (float) (sumgrade + 2.0*score[i]);
			}
			else if(grade[i].equals("C+")) {
				sumgrade = (float) (sumgrade + 2.5*score[i]);
			}
			else if(grade[i].equals("B0")) {
				sumgrade = (float) (sumgrade + 3.0*score[i]);
			}
			else if(grade[i].equals("B+")) {
				sumgrade = (float) (sumgrade + 3.5*score[i]);
			}
			else if(grade[i].equals("A0")) {
				sumgrade = (float) (sumgrade + 4.0*score[i]);
			}
			else if(grade[i].equals("A+")) {
				sumgrade = (float) (sumgrade + 4.5*score[i]);
			}
			else if(grade[i].equals("P")) {
				sumscore = sumscore - score[i];
			}
			
			
		}
		
		System.out.printf("%.6f", sumgrade/sumscore);
		
		// 3학점이면 3학점*grade / 과목수?
		//
	}
}
