class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[][] character = new int[4][2];
        char[] ch = {'R','T','C','F','J','M','A','N'};

        for(int i = 0; i < choices.length; i++){
            char c = '\n';
            int score = choices[i];
            if(choices[i] < 4){
                score = 4 - score;
                c = survey[i].charAt(0);
            } else if(choices[i] > 4){
                c = survey[i].charAt(1);
                score -= 4;
            }

            switch (c){
                case 'R':
                    character[0][0] += score;
                    break;
                case 'T':
                    character[0][1] += score;
                    break;

                case 'C':
                    character[1][0] += score;
                    break;
                case 'F':
                    character[1][1] += score;
                    break;

                case 'J':
                    character[2][0] += score;
                    break;
                case 'M':
                    character[2][1] += score;
                    break;

                case 'A':
                    character[3][0] += score;
                    break;
                case 'N':
                    character[3][1] += score;
                    break;
            }
        }
        for(int i = 0; i < character.length; i++)
            answer += (character[i][0] >= character[i][1]) ? ch[2 * i] : ch[2 * i + 1];
        return answer;
    }
}