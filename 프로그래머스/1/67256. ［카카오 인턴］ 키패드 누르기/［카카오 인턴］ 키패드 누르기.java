class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] nowL = {3, 0};
        int[] nowR = {3, 2};

        StringBuilder sb = new StringBuilder();
        for(int i : numbers){
            if(i == 1 || i == 4 || i == 7) {
                sb.append("L");
                nowL[0] = i / 3;
                nowL[1] = 0;
            } else if(i == 3 || i == 6 || i == 9) {
                sb.append("R");
                nowR[0] = i / 3 - 1;
                nowR[1] = 2;
            } else{
                int[] nowNum = {((i == 0) ? 3 : i / 3), 1};
                int diffL = Math.abs(nowL[0] - nowNum[0]) + (nowNum[1] - nowL[1]);
                int diffR = Math.abs(nowR[0] - nowNum[0]) + (nowR[1] - nowNum[1]);
                if(diffL < diffR){
                    sb.append("L");
                    nowL = nowNum;
                } else if(diffL == diffR){
                    if(hand.equals("left")){
                        sb.append("L");
                        nowL = nowNum;
                    } else {
                        sb.append("R");
                        nowR = nowNum;
                    }
                } else{
                    sb.append("R");
                    nowR = nowNum;
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}