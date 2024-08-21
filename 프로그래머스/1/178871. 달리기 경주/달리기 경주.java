import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < players.length; i++)
            map.put(players[i], i);

        for(String s : callings){
            int idx = map.get(s);
            String tmp = players[idx - 1];
            players[idx] = tmp;
            players[idx - 1] = s;
            map.put(s, idx - 1);
            map.put(tmp, idx);
        }
        String[] answer = players;
        return answer;
    }
}