class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int mult = 10000;
        for(int i = 1; i <= rank.length; i++){
            for(int j = 0; j < rank.length; j++){
                if(rank[j] == i && attendance[j]){
                    answer += j * mult;
                    mult /= 100;
                    break;
                }
            }
            if(mult == 0){
                break;
            }
        }
        return answer;
    }
}