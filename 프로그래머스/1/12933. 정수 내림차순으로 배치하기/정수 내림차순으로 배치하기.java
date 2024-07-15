import java.util.*;
class Solution {
    public long solution(long n) {
        char[] c = (n + "").toCharArray();
        Arrays.sort(c);
        String s = "";
        for(int i = c.length - 1; i >= 0; i--){
            s += c[i];
        }
        long answer = Long.parseLong(s);
        return answer;
    }
}