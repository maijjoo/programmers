class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            String s = "";
            if(start != 0){
                s += my_string.substring(0, start);
            }
            StringBuilder sb = new StringBuilder(my_string.substring(start,end + 1));
            s += sb.reverse().toString();
            s += my_string.substring(end + 1);
            my_string = s;
        }
        return my_string;
    }
}