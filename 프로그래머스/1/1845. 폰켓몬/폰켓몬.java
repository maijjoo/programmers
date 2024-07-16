import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length / 2;
        int answer = 0;

        for(int i : nums){
            set.add(i);
        }

        if(set.size() >= n){
            answer = n;
        }else {
            answer = set.size();
        }
        return answer;
    }
}