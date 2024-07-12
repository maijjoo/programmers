import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        int index = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i += index){
            if(Integer.toString(i).startsWith("5") && Integer.toString(i).replace("5","").replace("0","").equals("")){
                list.add(i);
                index = 5;
            }
        }
        if(list.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else{
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        }
        return answer;
    }
}