class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                answer += (char)ch;
            } else if(Character.isUpperCase(ch)) {
                if(ch + n > 'Z'){
                    answer += (char)(ch + n - 26);
                } else {
                    answer += (char)(ch + n);
                }
            } else {
                if(ch + n > 'z'){
                    answer += (char)(ch + n - 26);
                } else {
                    answer += (char)(ch + n);
                }
            }
        }
        return answer;
    }
}