class Solution {
    public int solution(String dartResult) {
        String bonus = "";
        String option = "";
        int answer = 0;
        String tmp = "";
        String mod = "";
        int[] cnt = new int[3];
        int idx = 0;
        for(char c : dartResult.toCharArray()){
            if(c >= '0' && c <= '9')
                mod = "num";
            else if(c >= 'D' && c <= 'T')
                mod = "bns";
            else
                mod = "opt";

            switch(mod){
                case "num":
                    tmp += c;
                    break;
                case "bns":
                    bonus += c;
                    if(bonus.equals("D"))
                        cnt[idx] = (int) Math.pow(Integer.parseInt(tmp), 2);
                    else if(bonus.equals("T"))
                        cnt[idx] = (int) Math.pow(Integer.parseInt(tmp), 3);
                    else
                        cnt[idx] = Integer.parseInt(tmp);
                    bonus = "";
                    tmp = "";
                    idx++;
                    break;
                case "opt":
                    option += c;
                    if(option.equals("*")){
                        if(idx == 1)
                            cnt[idx - 1] = 2 * cnt[idx - 1];
                        else {
                            cnt[idx - 1] = 2 * cnt[idx - 1];
                            cnt[idx - 2] = 2 * cnt[idx - 2];
                        }
                    } else if(option.equals("#"))
                        cnt[idx - 1] = -1 * cnt[idx - 1];
                    option = "";
                    break;
            }
        }
        for(int i = 0; i < 3; i++){
            answer += cnt[i];    
        }
        return answer;
    }
}