class Solution {
    public int[] solution(String[] wallpaper) {
        int wMin = wallpaper[0].length();
        int wMax = 0;
        int hMin = wallpaper.length;
        int hMax = 0;

        for(int i = 0; i < wallpaper.length; i++){
            String s = wallpaper[i];
            int left = s.indexOf('#');
            int right = s.lastIndexOf('#');

            if(left != -1){
                wMin = (left <= wMin) ? left : wMin;
                wMax = (right + 1 >= wMax) ? right + 1 : wMax;
                hMin = (i <= hMin) ? i : hMin;
                hMax = (i + 1 >= hMax) ? i + 1 : hMax;
            }
        }
        int[] answer = {hMin, wMin, hMax, wMax};
        return answer;
    }
}