class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] bin1 = new String[n];
        String[] bin2 = new String[n];

        for(int i = 0; i < n; i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            while(s1.length() < n){
                s1 = "0" + s1;
            }
            String s2 = Integer.toBinaryString(arr2[i]);
            while(s2.length() < n){
                s2 = "0" + s2;
            }
            bin1[i] = s1;
            bin2[i] = s2;
        }
        for(int i = 0; i < n; i++){
            String s = "";
            for(int j = 0; j < n; j++){
                if(bin1[i].charAt(j) == bin2[i].charAt(j) && bin1[i].charAt(j) == '1')
                    s += "#";
                else if(bin1[i].charAt(j) == bin2[i].charAt(j) && bin1[i].charAt(j) == '0')
                    s += " ";
                else
                    s += "#";
            }
            answer[i] = s;
        }
        return answer;
    }
}