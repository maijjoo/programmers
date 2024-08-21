import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(stack.isEmpty() && c == ')') {
                answer = false;
                break;
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            answer = false;
        }
        return answer;
    }
}