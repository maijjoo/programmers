import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        //System.out.println(Arrays.toString(participant));
        Arrays.sort(completion);
        //System.out.println(Arrays.toString(completion));

        for(int i = 0; i < participant.length; i++){
            if(i == completion.length || !completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
        }
        return answer;
    }
}