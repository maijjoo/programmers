import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        int n = 0;

        for(int i = 0; i < answer.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int index = 0;
            int[] tmp = new int[end - start + 1];
            for(int j = start; j <= end; j++){
                tmp[index] = array[j - 1];
                index++;
            }
            Arrays.sort(tmp);
            int idx = commands[i][2];
            answer[n] = tmp[idx - 1];
            n++;
        }
        
        return answer;
    }
}