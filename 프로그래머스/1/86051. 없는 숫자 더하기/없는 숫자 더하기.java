class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        String s = "9876543210";
        for(int i : numbers){
            s = s.replaceAll(i + "", "");
        }
        if(s.equals("")){
            answer = 0;
        }else{
            for(char c : s.toCharArray()){
                answer += Character.getNumericValue(c);
            }
        }
        return answer;
    }
}