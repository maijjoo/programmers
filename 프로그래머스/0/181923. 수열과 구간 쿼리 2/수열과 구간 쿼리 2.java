class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        Temp temp = new Temp();

        for(int i = 0; i < queries.length; i++){
            temp.min = -1;
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(arr[j] > queries[i][2]){
                    if(!temp.isInit){
                        temp.isInit = true;
                        temp.min = arr[j];
                    }else if(arr[j] < temp.min){
                        temp.min = arr[j];
                    }
                }
            }
            answer[i] = temp.min;
            temp.isInit = false;
        }
        
        return answer;
    }
}
class Temp{
    boolean isInit = false;
    int min;
}