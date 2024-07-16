import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016,a,b);
        DayOfWeek i = localDate.getDayOfWeek();
        String answer = i.toString().substring(0,3);
        return answer;
    }
}