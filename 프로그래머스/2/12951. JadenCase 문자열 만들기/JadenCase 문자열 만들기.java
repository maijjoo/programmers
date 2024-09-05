class Solution {
    public String solution(String s) {
        StringBuilder sb_temp = new StringBuilder();
        StringBuilder sb_answer = new StringBuilder();
        String mode = "";

        for(char ch : s.toCharArray()){
            String c = Character.toString(ch);
            if(c.matches("[0-9]")) mode = "digit";
            else if(c.matches(" ")) mode = "space";
            else mode = "alpha";

            switch(mode) {
                case "digit":
                    sb_temp.append(c.toLowerCase());
                    break;
                case "space":
                    if(!sb_temp.toString().isEmpty()){
                        sb_answer.append(sb_temp.toString());
                        sb_temp = new StringBuilder();
                    }
                    sb_answer.append(c);
                    break;
                case "alpha":
                    if(sb_temp.toString().isEmpty()) sb_temp.append(c.toUpperCase());
                    else sb_temp.append(c.toLowerCase());
                    break;
            }
        }
        if(!sb_temp.toString().isEmpty()) sb_answer.append(sb_temp.toString());

        String answer = sb_answer.toString();
        return answer;
    }
}