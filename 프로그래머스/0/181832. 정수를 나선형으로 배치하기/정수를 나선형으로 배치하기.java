class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;
        int y = 0;
        int left = -1;
        int right = n;
        int top = 0;
        int bot = n;
        char mod = 'r';
        for(int i = 0; i < n * n; i++){
            switch (mod) {
                case 'r':
                    answer[y][x] = i + 1;
                    x++;
                    if(x == right){
                        top = y;
                        mod = 'd';
                        x--;
                        y++;
                    }
                    break;
                case 'd':
                    answer[y][x] = i + 1;
                    y++;
                    if(y == bot){
                        right = x;
                        mod = 'l';
                        y--;
                        x--;
                    }
                    break;
                case 'l':
                    answer[y][x] = i + 1;
                    x--;
                    if(x == left){
                        bot = y;
                        mod = 'u';
                        x++;
                        y--;
                    }
                    break;
                case 'u':
                    answer[y][x] = i + 1;
                    y--;
                    if(y == top){
                        left = x;
                        mod = 'r';
                        x++;
                        y++;
                    }
                    break;
            }
        }
        return answer;
    }
}