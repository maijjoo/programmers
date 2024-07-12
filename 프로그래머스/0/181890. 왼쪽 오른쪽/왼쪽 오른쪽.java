import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String s = "";

        for(int i = 0; i < str_list.length; i++){
            s += str_list[i];
        }
        if(!s.contains("l") && !s.contains("r")){
            return answer;
        } else if(s.contains("l") && s.contains("r")){
            int l = s.indexOf("l");
            int r = s.indexOf("r");
            if(l < r){
                if(l == 0){
                    return answer;
                }else{
                    answer = new String[s.indexOf("l")];
                    for(int i = 0; i < answer.length; i++){
                        answer[i] = s.charAt(i) + "";
                    }
                }
            } else{
                if(r == s.length() - 1){
                    return answer;
                }else{
                    int index = 0;
                    answer = new String[s.length() - s.indexOf("r") - 1];
                    for(int i = s.indexOf("r") + 1; i < s.length(); i++){
                        answer[index] = s.charAt(i) + "";
                        index++;
                    }
                }
            }
        } else if(s.contains("l")){
            if(s.indexOf("l") == 0){
                return answer;
            }else{
                answer = new String[s.indexOf("l")];
                for(int i = 0; i < answer.length; i++){
                    answer[i] = s.charAt(i) + "";
                }
            }
        } else{
            if(s.indexOf("r") == s.length() - 1){
                return answer;
            }else{
                int index = 0;
                answer = new String[s.length() - s.indexOf("r") - 1];
                for(int i = s.indexOf("r") + 1; i < s.length(); i++){
                    answer[index] = s.charAt(i) + "";
                    index++;
                }
            }
        }
        return answer;
    }
}