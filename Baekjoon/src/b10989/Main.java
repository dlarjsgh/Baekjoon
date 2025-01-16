package b10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testnumber = Integer.parseInt(br.readLine());
        int array[] = new int[testnumber];
        
        for(int c=0; c<testnumber; c++) {
        	int number = Integer.parseInt(br.readLine());
        	
        	array[c] = number;
        }
        
        Arrays.sort(array);
        
        for(int n : array) {
        	sb.append(n).append("\n");
        }
        System.out.println(sb);
    }
}

