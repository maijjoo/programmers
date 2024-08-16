class Solution {
    public int solution(int n) {
        int answer = 1;

        for(int i = 3; i <= n; i++){
            if(i % 2 != 0 && isPrime(i))
                answer++;
        }
        return answer;
    }
    static boolean isPrime(int num) {
        for(int i = 2; i * i <= num; i++){
            if(i * i == num)
                return false;
            else if(num % i == 0)
                return false;
        }
        return true;
    }
}