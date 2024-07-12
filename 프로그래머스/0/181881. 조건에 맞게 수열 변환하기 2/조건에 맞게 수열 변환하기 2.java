import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];
        
        while(true){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr2[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr2[i] = arr[i] * 2 + 1;
                } else{
                    arr2[i] = arr[i];
                }
            }
            answer++;
            
            if((Arrays.toString(arr).equals(Arrays.toString(arr2)))){
                break;
            }else{
                arr = arr2.clone();
            }
            
        }
        
        return answer - 1;
    }
}