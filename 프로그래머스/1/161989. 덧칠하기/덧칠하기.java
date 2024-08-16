class Solution {
    public int solution(int n, int m, int[] section) {
        boolean painted = false;

        int answer = 0;
        for(int i = 0; i < section.length; i++){
            painted = false;
            int tmp = section[i] + m - 1;
            for (int j = i; j < section.length; j++) {
                if (section[j] != 0 && section[j] <= tmp) {
                    section[j] = 0;
                    painted = true;
                }
            }
            if(painted)
                answer++;
        }
        return answer;
    }
}