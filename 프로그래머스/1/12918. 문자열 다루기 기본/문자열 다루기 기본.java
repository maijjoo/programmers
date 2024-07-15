class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        for(char c : s.toCharArray()){
            int i = Character.getNumericValue(c);
            if(i > 9){
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}