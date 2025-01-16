package b1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M, V;
	static int[][]array;
	static boolean[] visited;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());	
		
		array = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		
		for(int i=0; i<M; i++) {
			StringTokenizer nst = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(nst.nextToken());
			int b = Integer.parseInt(nst.nextToken());	
			
			array[a][b] = array[b][a] = 1;
		}
	
		dfs(V);
		System.out.println(sb);
		

	}
	private static void dfs(int V) {
		visited[V] = true;
		sb.append(V + " ");
		
		for(int i = 0 ; i <= N ; i++) {          //3 true 3     i는 0 <= 5까면 0 1 2 3 4 5 0일때 array[3][0]  i =1 일때 array[3][1] ==1 && visited[1] == false;
			if(array[V][i] == 1 && !visited[i])       //즉 dfs(1); 1을 true로하고 1을 넣는다. 3 1     그리고 아직 3 4
				dfs(i);
		}

	}	

}

