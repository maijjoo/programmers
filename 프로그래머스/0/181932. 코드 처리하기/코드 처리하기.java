class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        boolean b;

        for(int i = 0; i < code.length(); i++){
            b = code.charAt(i) == '1';
            switch(mode){
                case 0:
                    if(b){
                        mode = 1;
                    } else if(i % 2 == 0){
                        answer += code.charAt(i);
                    }
                    break;
                case 1:
                    if(b){
                        mode = 0;
                    } else if(i % 2 == 1){
                        answer += code.charAt(i);
                    }
                    break;
            }
        }
        if(answer.isEmpty()){
            return "EMPTY";
        } else {
            return answer;
        }
    }
}