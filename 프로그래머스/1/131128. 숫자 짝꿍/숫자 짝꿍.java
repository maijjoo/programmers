import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] numX = new int[10];
        int[] numY = new int[10];

        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < X.length(); i++){
            int tmp = Character.getNumericValue(X.charAt(i));
            numX[tmp]++;
        }

        for(int i = 0; i < Y.length(); i++){
            int tmp = Character.getNumericValue(Y.charAt(i));
            numY[tmp]++;
        }

        for(int i = numX.length - 1; i >= 0; i--){
            if(numX[i] != 0 && numY[i] != 0){
                int small = (numX[i] >= numY[i]) ? numY[i] : numX[i];
                for(int j = 0; j < small; j++)
                    sb.append(i);
            }
        }

        if(sb.length() == 0)
            answer = "-1";
        else if(sb.toString().replace("0","").isEmpty())
            answer = "0";
        else
            answer = sb.toString();
        return answer;
    }
}