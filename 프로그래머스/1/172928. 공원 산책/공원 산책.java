class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;

        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")){
                x = park[i].indexOf("S");
                y = i;
            }
        }

        for(String s : routes){
            String[] order = s.split(" ");
            switch(order[0]){
                case "E":
                    if((x + Integer.parseInt(order[1])) < park[0].length() && !park[y].substring(x + 1, x + Integer.parseInt(order[1]) + 1).contains("X")) {
                        x += Integer.parseInt(order[1]);
                    }
                    break;
                case "W":
                    if((x - Integer.parseInt(order[1])) >= 0 && !park[y].substring(x - Integer.parseInt(order[1]), x).contains("X")) {
                        x -= Integer.parseInt(order[1]);
                    }
                    break;
                case "S":
                    if((y + Integer.parseInt(order[1])) < park.length){
                        boolean existX = false;
                        for(int i = y + 1; i <= y + Integer.parseInt(order[1]); i++){
                            if(park[i].charAt(x) == 'X') {
                                existX = true;
                                break;
                            }
                        }
                        if(!existX)
                            y += Integer.parseInt(order[1]);
                    }
                    break;
                case "N":
                    if((y - Integer.parseInt(order[1])) >= 0){
                        boolean existX = false;
                        for(int i = y - 1; i >= y - Integer.parseInt(order[1]); i--){
                            if(park[i].charAt(x) == 'X') {
                                existX = true;
                                break;
                            }
                        }
                        if(!existX)
                            y -= Integer.parseInt(order[1]);
                    }
                    break;
            }
        }
        int[] answer = {y, x};
        return answer;
    }
}