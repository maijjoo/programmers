class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(char c : s.toCharArray()){
            for(int i = 0; i < index; i++){
                c += 1;
                if(c > 'z')
                    c -= 26;
                if(skip.contains(Character.toString(c))){
                    i--;
                }
            }
            answer += c;
        }
        return answer;
    }
}