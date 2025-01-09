package b1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();
        HashMap<Character, Integer> frequencyMap = new HashMap<>(); // HashMap은 키와 값으로 이루어져있다. 여기서 키는 Character 이고 값은 Integer 이다.
        
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i); //매번 초기화 되네 c의 값이 만약 i가 0이라면 c의 값이 첫번째 문자로 초기화됨... 이 c를 가지고 무엇을 할까 이 c의 값을 
        	frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);                           // frequencyMap.put은 키와 값을 넣는 것. 아까 배웠던 Map.put("사과", 10) 기억하지? 여기는 String, Integer 이였어 여기는 
        }
        
        char maxchar = '?';
        int maxcount = 0;
        
        for(char c : frequencyMap.keySet()) { // 일단 for each 문은 선언문 : 반복할함수 이런 꼴인데 일단 배열이든 뭐든 끝까지 실행되며 그값을 선언문에 저장한다.
        	//즉 keyset()을 작성하면 c에 다가 frequencyMap의 char값을 모두 넣는다.         아래에서 get(c)를 하면 c의 빈도수를 출력한다.
        	int count = frequencyMap.get(c);
        	if(maxcount<count) {
        		maxcount = count;
        		maxchar = c;       
        }
        	else if(maxcount == count) {
        		maxchar = '?';
        	}
 }
        System.out.println(maxchar);
        
        
        
    }
}
