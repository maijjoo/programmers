class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean a = true;
        
        switch(ineq){
            case ">":
                a = eq.equals("=") ? (n >= m) : (n > m);
                break;
            case "<":
                a = eq.equals("=") ? (n <= m) : (n < m);
                break;
        }    
        return a ? 1 : 0;
    }
}