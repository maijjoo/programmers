class Solution {
    public int solution(String s) {
        int answer = 0;
        char tmp = '\n';
        int[] arr = {0, 0};

        for(char c : s.toCharArray()){
            if(tmp == '\n')
                tmp = c;
            if(c == tmp)
                arr[0]++;
            else
                arr[1]++;

            if(arr[0] == arr[1]){
                answer++;
                tmp = '\n';
                arr[0] = 0;
                arr[1] = 0;
            }
        }
        if(arr[0] != 0)
            answer++;
        return answer;
    }
}