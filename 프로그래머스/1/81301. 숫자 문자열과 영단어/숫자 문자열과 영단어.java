class Solution {
    public int solution(String s) {
        String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[] num = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < str.length; i++){
            s = s.contains(str[i]) ? s.replace(str[i], Integer.toString(num[i])) : s;
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}