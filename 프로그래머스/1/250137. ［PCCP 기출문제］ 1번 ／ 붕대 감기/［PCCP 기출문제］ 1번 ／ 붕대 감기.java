import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int timeNow = 0;
        int attackIdx = 0;
        int nowHP = health;
        int healTurn = 0;

        while(nowHP > 0){
            timeNow++;
            if(timeNow == attacks[attackIdx][0]){
                nowHP -= attacks[attackIdx][1];
                attackIdx++;
                healTurn = 0;
            } else if(nowHP < health) {
                healTurn++;
                nowHP = (nowHP + bandage[1]) <= health ? (nowHP + bandage[1]) : health;
                if(healTurn == bandage[0]){
                    nowHP = (nowHP + bandage[2]) <= health ? (nowHP + bandage[2]) : health;
                    healTurn = 0;
                }
            }
            if(attackIdx == attacks.length){
                break;
            }
        }
        answer = (nowHP <= 0) ? -1 : nowHP;
        return answer;
    }
}