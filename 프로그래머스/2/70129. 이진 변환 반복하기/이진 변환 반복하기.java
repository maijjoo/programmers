class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() > 1){
            int len1 = s.length();
            s = s.replaceAll("0","");
            int len2 = s.length();
            System.out.println(len1 - len2);
            int digit = s.length();
            s = Integer.toBinaryString(digit);
            answer[0]++;
            answer[1] += (len1 - len2);
        }
        return answer;
    }
}