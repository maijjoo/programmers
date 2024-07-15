class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = x + "";
        int sum = 0;
        char[] c = s.toCharArray();
        for(char ch : c){
            sum += Character.getNumericValue(ch);
        }
        answer = (x % sum == 0) ? true : false;
        return answer;
    }
}