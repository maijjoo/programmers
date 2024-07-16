class Solution {
    public int solution(int n) {
        int answer = 0;
        int topbit = 0;
        for(int i = 0;;i++){
            int max = (int) Math.pow(3, i);
            if(max > n){
                topbit = i;
                break;
            } else if(max == n){
                topbit = i + 1;
                break;
            }
        }
        int[] tri = new int[topbit];
        for(int i = 0; i < tri.length; i++){
            tri[i] = (int) (n / Math.pow(3,topbit - 1));
            n -= tri[i] * (int)Math.pow(3,topbit - 1);
            topbit--;
        }
        if(tri.length == 1){
            answer = 1;
        } else{
            for(int i = 0; i < tri.length; i++){
                answer += tri[i] * (int)Math.pow(3, i);
            }
        }
        return answer;
    }
}