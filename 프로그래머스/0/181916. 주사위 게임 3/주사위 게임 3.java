import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[6];
        for(int i = 0; i < 6; i++){
            if(a == i + 1){
                dice[i]++;
            }
            if(b == i + 1){
                dice[i]++;
            }
            if(c == i + 1){
                dice[i]++;
            }
            if(d == i + 1){
                dice[i]++;
            }
        }

        int answer = 0;

        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        int mod = set.size();
        int p = 0;
        int q = 0;
        int r = 0;

        switch(mod){
            case 1:
                answer = 1111 * set.iterator().next();
                break;
            case 2:
                p = 0;
                q = 0;
                boolean diff31 = false;
                for(int i = 0; i < 6; i++){
                    if(dice[i] == 3){
                        diff31 = true;
                        p = i + 1;
                    } else if(dice[i] == 1){
                        q = i + 1;
                    } else if(dice[i] == 2){
                        if(p != 0){
                            q = i + 1;
                        }else{
                            p = i + 1;
                        }
                    }
                }
                if(diff31){
                    answer = (int)Math.pow((10 * p + q), 2);
                }else{
                    answer = (p + q) * Math.abs(p - q);
                }
                break;
            case 3:
                for(int i = 0; i < 6; i++){
                    if(dice[i] == 1){
                        if(q != 0){
                            r = i + 1;
                        }else{
                            q = i + 1;
                        }
                    }
                }
                answer = q * r;
                break;
            case 4:
                for(int i = 0; i < 6; i++){
                    if(dice[i] == 1){
                        answer = i + 1;
                        break;
                    }
                }
                break;
        }
        return answer;
    }
}