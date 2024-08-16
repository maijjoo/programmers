import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] numOfCloth = new int[n];
        Arrays.fill(numOfCloth, 1);
        for (int i : reserve)
            numOfCloth[i - 1] += 1;
        for(int i : lost)
            numOfCloth[i - 1] -= 1;

        for(int i = 0; i < n; i++){
            if(numOfCloth[i] == 0){
                if(i == 0 && numOfCloth[i + 1] == 2){
                    numOfCloth[i] = 1;
                    numOfCloth[i + 1] = 1;
                } else if(i != 0 && numOfCloth[i - 1] == 2) {
                    numOfCloth[i] = 1;
                    numOfCloth[i - 1] = 1;
                }
            } else if(numOfCloth[i] == 2){
                if(i == 0 && numOfCloth[i + 1] == 0){
                    numOfCloth[i] = 1;
                    numOfCloth[i + 1] = 1;
                } else if(i != 0 && numOfCloth[i - 1] == 0){
                    numOfCloth[i] = 1;
                    numOfCloth[i - 1] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(numOfCloth[i] != 0)
                answer++;
        }
        return answer;
    }
}