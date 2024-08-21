import java.util.*;
class Solution {
    public String solution(String s) {
        String[] ss = s.split(" ");
        int[] arr = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            arr[i] = Integer.parseInt(ss[i]);
        }
        String answer = Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt();
        return answer;
    }
}