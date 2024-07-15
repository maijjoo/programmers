class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) return a;
        else{
            int max = a > b ? a : b;
            int min = a > b ? b : a;
            for(int i = min; i <= max; i++){
                answer += i;
            }
        }
        return answer;
    }
}