class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int len1 = s.length();
        s = s.replaceAll("p","");
        int len2 = len1 - s.length();
        s = s.replaceAll("y","");
        int len3 = len1 - len2 - s.length();
        if(len2 == len3){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}