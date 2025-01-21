package b2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int[][] array;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int computernumber = Integer.parseInt(br.readLine());
		int computerline = Integer.parseInt(br.readLine());
		int startcomputer = Integer.parseInt(br.readLine());
		
		array = new int[computernumber+1][computernumber+1];
		visited = new boolean[computernumber+1];
		
		for(int i=0; i<computerline; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			array[a][b] = array[b][a] = 1;
		}
		dfs(startcomputer);
		
		
	}
	
	public static void dfs(int startcomputer) {
		visited[startcomputer] = true;
		System.out.println(startcomputer + " ");
		
		if(startcomputer == array.length) {
			
		}
		
		
	}
}


