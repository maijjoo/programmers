import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] sum = new int[30];
        for(String str : strArr){
            sum[str.length() - 1]++;
        }
        Arrays.sort(sum);
        answer = sum[29];
        return answer;
    }
}