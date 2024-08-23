import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int[] giftPoint = new int[friends.length];
        int[] give = new int[friends.length];
        int[] take = new int[friends.length];
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < friends.length; i++)
            map.put(friends[i], i);

        for(String gift : gifts){
            String[] s = gift.split(" ");
            give[map.get(s[0])]++;
            take[map.get(s[1])]++;
        }

        for(int i = 0; i < give.length; i++)
            giftPoint[i] = give[i] - take[i];

        int[][] count = new int[friends.length][friends.length];

        for(int i = 0; i < friends.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(i != j){
                    StringBuilder sb = new StringBuilder();
                    sb.append(friends[i]).append(" ").append(friends[j]);
                    count[i][j] = (int) Arrays.stream(gifts).filter(gift -> gift.equals(sb.toString())).count();
                    gifts = Arrays.stream(gifts).filter(gift -> !gift.equals(sb.toString())).toArray(String[] :: new);
                }
            }
        }
        int[] next = new int[friends.length];
        for(int i = 0; i < friends.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(i != j){
                    int diff = count[i][j] - count[j][i];
                    if(diff > 0)
                        next[i]++;
                    else if(diff == 0){
                        if(giftPoint[i] > giftPoint[j])
                            next[i]++;
                    }
                }
            }
        }
        Arrays.sort(next);
        answer = next[next.length - 1];
        return answer;
    }
}