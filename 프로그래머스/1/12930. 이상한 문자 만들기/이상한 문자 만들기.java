import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                idx = 0;
                answer += s.charAt(i);
            } else {
                answer += (idx % 2 == 0) ?
                        Character.toUpperCase(s.charAt(i)) :
                        Character.toLowerCase(s.charAt(i));
                idx++;
            }
        }
        return answer;
    }
}