import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] nums = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());
        score = Arrays.stream(nums).mapToInt(Integer::intValue).toArray();

        for(int i = m - 1; i < score.length; i += m)
            answer += score[i] * m;
        return answer;
    }
}