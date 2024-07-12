import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        String answer = bigA.add(bigB).toString();
        return answer;
    }
}