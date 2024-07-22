class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        int[] supo1 = {5,1,2,3,4};
        int i = 1;
        int[] supo2 = {5,2,1,2,3,2,4,2};
        int j = 1;
        int[] supo3 = {5,3,3,1,1,2,2,4,4,5};
        int k = 1;
        for(int n : answers){
            if(supo1[i] == n){
                answer[0]++;
            }
            if(supo2[j] == n){
                answer[1]++;
            }
            if(supo3[k] == n){
                answer[2]++;
            }
            i++;
            j++;
            k++;
            if(i == supo1.length)
                i = 0;
            if(j == supo2.length)
                j = 0;
            if(k == supo3.length)
                k = 0;
        }
        int max = 0;
        int len = 0;
        for(int n = 0; n < answer.length; n++){
            if(answer[n] > max){
                len = 0;
                max = answer[n];
                len++;
            }
            else if(answer[n] == max){
                len++;
            }
        }
        int[] res = new int[len];
        int idx = 0;
        for(int n = 0; n < answer.length; n++){
            if(answer[n] == max){
                res[idx] = n + 1;
                idx++;
            }
        }
        return res;
    }
}