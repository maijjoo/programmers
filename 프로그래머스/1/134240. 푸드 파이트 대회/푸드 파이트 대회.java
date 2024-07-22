class Solution {
    public String solution(int[] food) {
        String answer = "0";
        for(int i = food.length - 1; i > 0; i--){
            int amount = food[i] / 2;
            for(int j = 0; j < amount; j++){
                answer = i + answer;
                answer = answer + i;
            }
        }
        return answer;
    }
}