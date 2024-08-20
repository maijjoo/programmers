import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        Stack<Integer> basket = new Stack<>();

        for(int j = 0; j < board[0].length; j++){
            Stack<Integer> stack = new Stack<>();
            for(int i = board.length - 1; i >= 0; i--){
                if(board[i][j] != 0)
                    stack.push(board[i][j]);
            }
            map.put(j, stack);
        }


        for(int i = 0; i < moves.length; i++){
            if(map.get(moves[i] - 1).isEmpty())
                continue;
            else {
                int tmp = map.get(moves[i] - 1).pop();
                if(basket.isEmpty())
                    basket.push(tmp);
                else if(basket.get(basket.size() - 1) == tmp){
                    basket.pop();
                    answer+=2;
                } else {
                    basket.push(tmp);
                }
            }
        }
        return answer;
    }
}