import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] stopped = new Double[N];
        HashMap<Integer, Double> list = new HashMap<>();
        int players = stages.length;

        for(int i = 0; i < N; i++){
            int tmp = 0;
            for(int j = 0; j < stages.length; j++){
                if(stages[j] == i + 1){
                    tmp++;
                }
            }
            stopped[i] = (players == 0) ? 0.0 : (double)tmp / players;
            players -= tmp;
            list.put(i, stopped[i]);
        }
        Arrays.sort(stopped, Collections.reverseOrder());

        for(int i = 0; i < stopped.length; i++){
            for(int j = 0; j < N; j++){
                if(stopped[i] == list.get(j)){
                    answer[i] = j + 1;
                    list.remove(j);
                }
            }
        }
        return answer;
    }
}