class Solution {
    public int solution(String[] babbling) {
        String[] canSay = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            String s = babbling[i];
            for(int j = 0; j < canSay.length; j++){
                String ss = canSay[j];
                String sss = ss + ss;
                if(s.contains(sss)){
                    break;
                } else if(s.contains(ss)) {
                    s = s.replaceAll(ss, " ");
                }
                if(s.length() == s.replaceAll("[a-z]", "").length()){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}