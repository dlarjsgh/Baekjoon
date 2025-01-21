package b1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;
	static int[][] array;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nodenumber = Integer.parseInt(st.nextToken());
		int linenumber = Integer.parseInt(st.nextToken());
		int startnode = Integer.parseInt(st.nextToken());
		
		array = new int[nodenumber+1][nodenumber+1];
		visited = new boolean[nodenumber+1];
		
		for(int i=0; i<linenumber; i++) {
			StringTokenizer nst = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(nst.nextToken());
			int b = Integer.parseInt(nst.nextToken());
			array[a][b] = array[b][a] = 1; //양방향 간선이다.
		}
		dfs(startnode);
		
		
		
		
	}
	
	public static void dfs(int startnode) {
		visited[startnode] = true;
		System.out.print(startnode + " ");
		
		for(int i=1; i<array.length; i++) { //전체 노드 순회
			if(array[startnode][i] == 1 && visited[i] == false) { //현재 방문한 노드가 간선이 존재하는 지 확인& 방문한적 없는지
				// 방문한적이 없다면 해당 i값에 대해 dfs를 실행하면 다음에 도착한 노드를 true로, 그리고 도착한 곳 출력 반복
				dfs(i);
			}
		}
		
	}
}

