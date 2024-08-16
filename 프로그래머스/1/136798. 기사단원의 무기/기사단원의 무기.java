class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            int n = 0;
            for(int j = 1; j * j<= i; j++){
                if(j * j == i)
                    n += 1;
                else if(i % j == 0)
                    n += 2;
            }
            if(n > limit)
                answer += power;
            else
                answer += n;
        }
        return answer;
    }
}