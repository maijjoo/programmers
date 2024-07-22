class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        
        for(int i = 0; i < answer.length; i++){
            if(i == 0){
                answer[i] = -1;
                continue;
            } else {
                for(int j = i - 1; j >= 0; j--){
                    if(s.charAt(i) == s.charAt(j)){
                        answer[i] = i - j;
                        break;
                    }
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}