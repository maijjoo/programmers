class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        if(n == 1){
            return 0;
        }
        for(int i = 0; i < 500; i++){
            answer++;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            if(n == 1){
                break;
            }
        }
        if(answer >= 500){
            answer = -1;
        }
        return answer;
    }
}