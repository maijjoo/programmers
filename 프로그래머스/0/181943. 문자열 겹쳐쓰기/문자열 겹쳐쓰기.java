class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] my = my_string.toCharArray();
        char[] over = overwrite_string.toCharArray();
        for(int i = s; i < s + over.length; i++){
            my[i] = over[i - s];
        }
        for(char c : my){
            answer += "" + c;
        }
        return answer;
    }
}