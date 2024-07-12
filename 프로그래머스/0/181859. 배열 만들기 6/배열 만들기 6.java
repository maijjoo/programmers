class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        String stk = "";
        for(int i = 0; i < arr.length;){
            if(stk.equals("")){
                stk += arr[i] + "";
                i++;
            }else{
                if(Character.getNumericValue(stk.charAt(stk.length() - 1)) == arr[i]){
                    stk = stk.substring(0,stk.length() - 1);
                    i++;
                }
                else{
                    stk += arr[i] + "";
                    i++;
                }
            }
        }
        if(stk.equals("")){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[stk.length()];
            for(int i = 0; i < stk.length(); i++){
                answer[i] = Character.getNumericValue(stk.charAt(i));
            }
        }
        return answer;
    }
}