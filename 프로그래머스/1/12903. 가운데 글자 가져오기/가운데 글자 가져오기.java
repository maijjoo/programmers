class Solution {
    public String solution(String s) {
        String answer = "";
        answer = (s.length() % 2 == 0) ? answer + s.charAt(s.length() / 2 - 1) + s.charAt(s.length() / 2) : answer + s.charAt(s.length() / 2);
        return answer;
    }
}