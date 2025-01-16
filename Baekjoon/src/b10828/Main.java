package b10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			
			if(s.startsWith("push")) {
				int value = Integer.parseInt(s.split(" ")[1]);
				stack.push(value);
			}
			
			else if(s.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append("-1\n");
				}
				else {
					sb.append(stack.pop()).append("\n");
				}
			}
			
			else if(s.equals("size")) {
				sb.append(stack.size()).append("\n");
			}
			
			else if(s.equals("empty")) {
				if(stack.isEmpty()) {
					sb.append("1").append("\n");
				}
				else {
					sb.append("0").append("\n");
				}
			}
			
			else if(s.equals("top")) {
				if(stack.isEmpty()) {
					sb.append("-1").append("\n");
				}
				else {
					sb.append(stack.peek()).append("\n");
				}
			}
			
			
			
		}
		System.out.println(sb);
			
		
	}
}


