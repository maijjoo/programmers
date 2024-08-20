import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;

        switch (sort_by){
            case "code":
                idx = 0;
                break;
            case "date":
                idx = 1;
                break;
            case "maximum":
                idx = 2;
                break;
            case "remain":
                idx = 3;
                break;
        }

        switch(ext){
            case "code":
                for(int i = 0; i < data.length; i++){
                    if(data[i][0] < val_ext)
                        list.add(i);
                }
                break;
            case "date":
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
                LocalDate val_ext_date = LocalDate.parse(Integer.toString(val_ext), formatter);
                for(int i = 0; i < data.length; i++){
                    LocalDate tmpDate = LocalDate.parse(Integer.toString(data[i][1]), formatter);
                    if(tmpDate.isBefore(val_ext_date))
                        list.add(i);
                }
                break;
            case "maximum":
                for(int i = 0; i < data.length; i++){
                    if(data[i][2] < val_ext)
                        list.add(i);
                }
                break;
            case "remain":
                for(int i = 0; i < data.length; i++){
                    if(data[i][3] < val_ext)
                        list.add(i);
                }
                break;
        }
        int[][] answer = new int[list.size()][data[0].length];
        for(int i = 0; i < answer.length; i++)
            answer[i] = data[list.get(i)];

        int finalIdx = idx;
        Arrays.sort(answer, (a, b) -> Integer.compare(a[finalIdx], b[finalIdx]));
        return answer;
    }
}