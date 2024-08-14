import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;

        for(int i : score){
            if(list.size() < k){
                list.add(i);
                Collections.sort(list);
                answer[index] = list.get(0);
                index++;
            } else if(list.get(0) < i) {
                list.remove(0);
                list.add(i);
                Collections.sort(list);
                answer[index] = list.get(0);
                index++;
            } else {
                answer[index] = list.get(0);
                index++;
            }
        }
        return answer;
    }
}