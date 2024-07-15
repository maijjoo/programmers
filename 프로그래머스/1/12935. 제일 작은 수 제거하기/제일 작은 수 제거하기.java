class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int minidx = 0;
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] <= arr[minidx]){
                    minidx = i;
                }
            }
            int index = 0;
            answer = new int[arr.length - 1];
            for(int i = 0; i < arr.length; i++){
                if(i == minidx){
                    continue;
                }else{
                    answer[index] = arr[i];
                    index++;
                }
            }
        }
        return answer;
    }
}