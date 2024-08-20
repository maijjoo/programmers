import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int max1 = 1;
        int max2 = 1;
        for(int i = 0; i < sizes.length; i++){
            int[] temp = sizes[i];
            Arrays.sort(temp);
            if(temp[0] >= max1)
                max1 = temp[0];
            if(temp[1] >= max2)
                max2 = temp[1];
        }
        answer = max1 * max2;
        return answer;
    }
}