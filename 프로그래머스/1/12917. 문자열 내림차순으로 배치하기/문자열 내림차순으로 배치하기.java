import java.util.*;
class Solution {
    public String solution(String s) {
        ArrayList<Character> lowerList = new ArrayList<>();
        ArrayList<Character> upperList = new ArrayList<>();
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                lowerList.add(s.charAt(i));
            } else {
                upperList.add(s.charAt(i));
            }
        }
        Character[] lowerCh = lowerList.toArray(new Character[0]);
        Character[] upperCh = upperList.toArray(new Character[0]);

        Arrays.sort(lowerCh, Collections.reverseOrder());
        Arrays.sort(upperCh, Collections.reverseOrder());

        for(int i = 0; i < lowerCh.length; i++){
            answer += lowerCh[i] + "";
        }
        for(int i = 0; i < upperCh.length; i++){
            answer += upperCh[i] + "";
        }
        return answer;
    }
}