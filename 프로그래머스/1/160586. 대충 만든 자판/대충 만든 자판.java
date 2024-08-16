import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alpcnt = new int[26];

        for(int i = 0; i < 26; i++){
            char c = 'A';
            c += i;
            for(int j = 0; j < keymap.length; j++){
                String s = keymap[j];
                if(s.contains(Character.toString(c))){
                    int k = s.indexOf(c) + 1;
                    if(alpcnt[i] == 0)
                        alpcnt[i] = k;
                    else if(alpcnt[i] != 0 && k < alpcnt[i])
                        alpcnt[i] = k;
                }
            }
        }
        for(int i = 0; i < targets.length; i++){
            for(char c : targets[i].toCharArray()){
                int j = c - 65;
                if(alpcnt[j] == 0){
                    answer[i] = -1;
                    break;
                }
                answer[i] += alpcnt[j];
            }
        }
        return answer;
    }
}