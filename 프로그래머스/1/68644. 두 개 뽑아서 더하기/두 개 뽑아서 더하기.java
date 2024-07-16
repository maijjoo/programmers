import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        answer = new int[list.size()];
        int idx = 0;
        while(idx < answer.length){
            answer[idx] = list.get(idx);
            idx++;
        }
        Arrays.sort(answer);
        return answer;
    }
}