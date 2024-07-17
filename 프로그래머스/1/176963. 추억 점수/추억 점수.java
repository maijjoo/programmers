class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        answer = new int[photo.length];
        for(int k = 0; k < photo.length; k++){
            int score = 0;
            for(int i = 0; i < photo[k].length; i++){
                for(int j = 0; j < name.length; j++){
                    if(photo[k][i].equals(name[j])){
                        score += yearning[j];
                    }
                }
            }
            answer[k] = score;
        }
        return answer;
    }
}