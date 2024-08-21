import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        today = today.replace(".", "");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate today_date = LocalDate.parse(today, formatter);

        HashMap<Character, Integer> map = new HashMap<>();
        for(String s : terms){
            char c = s.charAt(0);
            s = s.replace(Character.toString(c), "");
            s = s.trim();
            int i = Integer.parseInt(s);
            map.put(c, i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < privacies.length; i++){
            String s = privacies[i];
            char c = s.charAt(s.length() - 1);
            s = s.replace(Character.toString(c), "").trim().replace(".", "");
            LocalDate date = LocalDate.parse(s, formatter);
            int tmp = map.get(c);
            date = date.plusMonths(tmp).minusDays(1);
            if(date.getDayOfMonth() > 28) {
                String newDate = date.toString().replace("-", "").substring(0, 6) + "28";
                date = LocalDate.parse(newDate, formatter);
            }
            if(date.isBefore(today_date))
                list.add(i + 1);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}