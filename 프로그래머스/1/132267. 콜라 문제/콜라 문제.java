class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int bonus = b * (n / a);
            answer += bonus;
            n = n - a * (n / a) + bonus;
        }
        return answer;
    }
}