package b1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(Integer.parseInt(br.readLine()));
		for (int a : tree.descendingSet()) { // 결과 활용
		    System.out.print(a);
		}

	}
}