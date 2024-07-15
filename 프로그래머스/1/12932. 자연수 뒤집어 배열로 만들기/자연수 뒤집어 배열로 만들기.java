import java.util.*;
class Solution {
    public int[] solution(long n) {
        String s = new StringBuilder(Long.toString(n)).reverse().toString();
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            answer[i] = Character.getNumericValue(s.charAt(i));
        }
        return answer;
    }
}