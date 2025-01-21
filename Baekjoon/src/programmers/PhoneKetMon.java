package programmers;

import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {	
		int answer = 0;
    	HashSet<Integer> hashset = new HashSet<>();
		        
		        for(int i=0; i<nums.length; i++) {
		        	hashset.add(nums[i]);
		        }
		
		        
		        for(int n : hashset) {
		        	answer++;
		        	if(answer>=nums.length/2) {
		        		break;
		        	}
        }
		        System.out.println(answer);

        return answer;
    }
}