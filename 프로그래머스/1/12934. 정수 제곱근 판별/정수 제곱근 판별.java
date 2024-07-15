class Solution {
    public long solution(long n) {
        long x = 1;
        long answer = 0;
        while(x < n){
            if(n == Math.pow(x, 2)){
                break;
            }else{
                x++;
            }
        }
        answer = (x == n && x != 1)?-1: (long) Math.pow((x + 1), 2);
        return answer;
    }
}