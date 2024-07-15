import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        char[] ch = str.toCharArray();
        for(char c : ch){
            answer += Character.getNumericValue(c);
        }

        return answer;
    }
}