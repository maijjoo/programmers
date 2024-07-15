class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        int index = 0;
        for(long i = x;; i += x){
            if(index==n){
                break;
            }
            answer[index] = (long)i;
            index++;
        }
        return answer;
    }
}