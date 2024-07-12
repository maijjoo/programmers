class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer = new String[picture.length * k];
        int index = 0;
        for(int i = 0; i < answer.length; i += k){
            String s = picture[index];
            index++;
            String tmp = "";
            for(char c : s.toCharArray()){
                for(int j = 0; j < k; j++){
                    tmp += c;
                }
            }
            for(int l = i; l < i + k; l++){
                if(l >= answer.length){
                    break;
                }
                answer[l] = tmp;
            }
        }
        return answer;
    }
}