class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        boolean isCorrect = true;
        int turn = 1;
        int index1 = 0;
        int index2 = 0;
        int indexG = 0;

        while(isCorrect) {
            if(indexG == goal.length){
                break;
            } else if(index1 >= cards1.length && index2 >= cards2.length){
                answer = "No";
                break;
            }
            int corrected = 0;
            switch (turn){
                case 1:
                    for(int i = index1; i < cards1.length; i++){
                        if(indexG >= goal.length){
                            break;
                        }
                        if(cards1[index1].equals(goal[indexG])){
                            index1++;
                            indexG++;
                            corrected++;
                        } else {
                            break;
                        }
                    }
                    turn = 2;
                    if(index1 != 0 && corrected == 0){
                        isCorrect = false;
                        answer = "No";
                    } else if(index2 >= cards2.length && corrected == 0){
                        isCorrect = false;
                        answer = "No";
                    }
                    break;
                case 2:
                    for(int i = index2; i < cards2.length; i++){
                        if(indexG >= goal.length){
                            break;
                        }
                        if(cards2[index2].equals(goal[indexG])){
                            index2++;
                            indexG++;
                            corrected++;
                        } else {
                            break;
                        }
                    }
                    turn = 1;
                    if(corrected == 0){
                        isCorrect = false;
                        answer = "No";
                    }
                    break;
            }
        }
        return answer;
    }
}