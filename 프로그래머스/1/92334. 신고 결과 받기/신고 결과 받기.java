import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, Integer> id_idx_map = new HashMap<>();

        for(int i = 0; i < id_list.length; i++)
            id_idx_map.put(id_list[i], i);

        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
        for(String s : report){
            String[] ss = s.split(" ");
            if(!map.containsKey(ss[1])) {
                ArrayList<String> list = new ArrayList<>();
                list.add(ss[0]);
                map.put(ss[1], list);
            } else if(map.containsKey(ss[1]) && !map.get(ss[1]).contains(ss[0])){
                ArrayList<String> list = map.get(ss[1]);
                list.add(ss[0]);
                map.put(ss[1], list);
            }
        }
        Iterator<ArrayList<String>> iterator = map.values().iterator();
        for(int i = 0; i < map.size(); i++){
            ArrayList<String> tmp = iterator.next();
            
            if(tmp.size() >= k){
                for(int j = 0; j < tmp.size(); j++)
                    answer[id_idx_map.get(tmp.get(j))]++;
            }
        }
        return answer;
    }
}