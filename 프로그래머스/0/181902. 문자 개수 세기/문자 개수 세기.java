class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        while(!my_string.isEmpty()){
            char c = my_string.charAt(0);
            int len = my_string.length();
            int index = 0;
            my_string = my_string.replaceAll(c + "","");
            int newlen = my_string.length();
            if(Character.isLowerCase(c)){
                index = c - 71;
            }else{
                index = c - 65;
            }
            answer[index] = len - newlen;
        }
        return answer;
    }
}