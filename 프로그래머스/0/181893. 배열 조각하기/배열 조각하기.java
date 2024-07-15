import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        Stack<Integer> stackEven = new Stack<>();
        Stack<Integer> stackOdd = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            stackEven.push(arr[i]);
        }

        for(int i = 0; i < query.length; i++){
            if (i % 2 == 0) {
                int size = stackEven.size();

                for(int j = 0; j < size - query[i] - 1; j++){
                    stackEven.pop();
                }
                while(!stackEven.empty()){
                    stackOdd.push(stackEven.pop());
                }
                stackEven.clear();
            } else {
                for(int j = 0; j < query[i]; j++){
                    stackOdd.pop();
                }
                while(!stackOdd.empty()){
                    stackEven.push(stackOdd.pop());
                }
                stackOdd.clear();
            }
        }
        int len = (stackEven.isEmpty())?stackOdd.size():stackEven.size();
        answer = new int[len];
        if(!stackEven.empty()){
            while(!stackEven.empty()){
                stackOdd.push(stackEven.pop());
            }
        }
        for (int i = 0; i < len; i++) {
            answer[i] = stackOdd.pop();
        }
        return answer;
    }
}