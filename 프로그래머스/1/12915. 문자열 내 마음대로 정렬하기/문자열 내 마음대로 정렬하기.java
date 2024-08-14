import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        Map<Character, String> map = new HashMap<>();
        char[] ch = new char[strings.length];

        for(int i = 0; i < strings.length; i++){
            if(map.containsKey(strings[i].charAt(n))){
                String s = map.get(strings[i].charAt(n));
                s += "," + strings[i];
                map.put(strings[i].charAt(n), s);
            }else{
            map.put(strings[i].charAt(n), strings[i]);
            }
            ch[i] = strings[i].charAt(n);
        }
        Arrays.sort(ch);

        String[] answer = {};
        answer = new String[strings.length];

        for(int i = 0; i < strings.length;){
            if(map.get(ch[i]).split(",").length > 1){
                String s = map.get(ch[i]);
                String[] ss = s.split(",");
                Arrays.sort(ss);
                for(String sss : ss){
                    answer[i] = sss;
                    i++;
                }
            } else {
                answer[i] = map.get(ch[i]);
                i++;
            }
        }
        return answer;
    }
}