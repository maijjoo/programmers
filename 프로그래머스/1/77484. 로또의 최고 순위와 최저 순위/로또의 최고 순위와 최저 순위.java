import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : win_nums){
            list.add(i);
        }

        int zero = 0;
        int correct = 0;
        for(int i : lottos){
            if(i == 0){
                zero++;
            } else if(list.contains(i)){
                correct++;
            }
        }

        int[] answer = new int[2];
        if(correct == 6){
            answer[0] = 1;
            answer[1] = 1;
        } else if(correct + zero == 0){
            answer[0] = 6;
            answer[1] = 6;
        } else if(correct == 0){
            answer[0] = 7 - zero;
            answer[1] = 6;
        }else{
            answer[0] = 7 - (correct + zero);
            answer[1] = 7 - correct;
        }
        return answer;
    }
}